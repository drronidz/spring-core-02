package guru.springframework.services.security;

/*
PROJECT NAME : Spring Core Advanced - Beyond the Basics (Part 2)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/7/2022 11:04 PM
*/

import guru.springframework.domain.User;
import guru.springframework.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    @Scheduled(fixedRate = 6000)
    public void resetFailedLogins() {
        System.out.println("Checking for locked account ...");

        List<User> users = (List<User>) userService.listAll();

        users.forEach(user -> {
            if (!user.getEnabled() && user.getFailedLoginAttempts() > 0) {
                System.out.println("Resetting failed attempts for user: " + user.getUsername());
                user.setFailedLoginAttempts(0);
                user.setEnabled(true);
                userService.saveOrUpdate(user);
            }
        });
    }
}
