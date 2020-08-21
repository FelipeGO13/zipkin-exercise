package br.com.mastertech.user.service;

import br.com.mastertech.user.client.Address;
import br.com.mastertech.user.client.AddressClient;
import br.com.mastertech.user.model.User;
import br.com.mastertech.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressClient addressClient;

    @NewSpan(name = "create-user-service")
    public User create(@SpanTag("usuario") User user){
       Address address = addressClient.getAddressByCep(user.getPostalCode());

       User createdUser = new User();
       createdUser.setName(user.getName());
       createdUser.setPostalCode(address.getPostalCode());

       return userRepository.save(createdUser);
    }
}
