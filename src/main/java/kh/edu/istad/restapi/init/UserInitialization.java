package kh.edu.istad.restapi.init;

import jakarta.annotation.PostConstruct;
import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class UserInitialization {
    private final UserRepository userRepository;

    @PostConstruct
    void init(){

        log.info("User Initializing....");
        log.info("Waiting a bit ....");

        User user =  new User();
        user.setName("Oudom");
        user.setUsername("Oudom.71$");
        user.setIsActive(true);
        user.setPassword("123456789");

        if(userRepository.count() == 0){
            userRepository.save(user);
        }

    }
}
