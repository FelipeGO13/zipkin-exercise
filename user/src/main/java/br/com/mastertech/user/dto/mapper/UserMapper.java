package br.com.mastertech.user.dto.mapper;

import br.com.mastertech.user.dto.UserRequest;
import br.com.mastertech.user.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toUser(UserRequest userRequest){
        User user = new User();
        user.setName(userRequest.getName());
        user.setPostalCode(userRequest.getPostalCode());

        return user;
    }
}
