package br.com.mastertech.user.repository;

import br.com.mastertech.user.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
