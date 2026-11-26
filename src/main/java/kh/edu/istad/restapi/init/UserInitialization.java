package kh.edu.istad.restapi.init;

import jakarta.annotation.PostConstruct;
import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Slf4j
@RequiredArgsConstructor
public class UserInitialization {
    Scanner scanner = new Scanner(System.in);
    private final UserRepository userRepository;

    @PostConstruct
    void init(){

        log.info("User Initializing....");
        log.info("Waiting a bit ....");

//        User user =  new User();
//        IO.print("Enter your name: ");
//        user.setName(scanner.nextLine());
////        user.setName("Oudom");
//        IO.print("Enter your username: ");
//        user.setUsername(scanner.nextLine());
////        user.setUsername("Oudom.71$");
//        user.setIsActive(true);
//        IO.print("Enter your password: ");
//        user.setPassword(scanner.next());
////        user.setPassword("123456789");

        User user1 = new User();
        user1.setName("John Doe");
        user1.setUsername("johndoe");
        user1.setPassword("password123");
        user1.setIsActive(true);

        User user2 = new User();
        user2.setName("Jane Smith");
        user2.setUsername("janesmith");
        user2.setPassword("secret456");
        user2.setIsActive(true);

        User user3 = new User();
        user3.setName("Alex Johnson");
        user3.setUsername("alex");
        user3.setPassword("pass789");
        user3.setIsActive(false);

        if(userRepository.count() == 0){
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
        }

    }
}
