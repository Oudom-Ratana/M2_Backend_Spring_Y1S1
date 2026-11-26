package kh.edu.istad.restapi.repository;


import kh.edu.istad.restapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepositoryClass {
    private List<User> users;

    public UserRepositoryClass(){
        users = new ArrayList<>();
//        User usrAdmin = new User(UUID.randomUUID(), "AdminSart", "admin","admin123", true );
//        User usr1 = new User(UUID.randomUUID(), "Thana", "user","admin123", true );
//        User usr2 = new User(UUID.randomUUID(), "Sexy-thana", "user","admin123", true );
//        users.add(usrAdmin);
//        users.add(usr1);
//        users.add(usr2);

    }
    public List<User> selectAll(){
        return users;
    }
    public Optional<User> selectById(UUID id){
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public User insert(User user){
        user.setId(UUID.randomUUID());
        user.setIsActive(true);
        users.add(user);
        return user;
    }

    public boolean deleteById(UUID id){
        return users.removeIf(user -> user.getId().equals(id));
    }
}
