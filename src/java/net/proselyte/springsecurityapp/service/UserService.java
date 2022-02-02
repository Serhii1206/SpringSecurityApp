package net.proselyte.springsecurityapp.service;

//import jdk.javadoc.internal.doclets.toolkit.taglets.UserTaglet;
import net.proselyte.springsecurityapp.model.User;

/**
 * Service class for {@link net.proselyte.springsecurityapp.model.User}
 *
 * @author Serhii Berdychevskyi
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUserName(String username);
}
