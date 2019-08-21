package io.github.gdiazs.javaee8.register;

import io.github.gdiazs.javaee8.users.User;
import io.github.gdiazs.javaee8.users.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;
import java.util.UUID;

@Named
@Singleton
public class RegisterService {

    @Inject
    private UserRepository userRepository;

    @Transactional
    public void createNewActiveUser(String username) throws RegisterException{

        try{
            User user = new User();
            user.setId(UUID.randomUUID() + "");
            user.setUsername(username);
            userRepository.save(user);
        }catch (PersistenceException pe){
            pe.printStackTrace();
            throw new RegisterException("Error happened during account creation", pe);
        }
    }
}
