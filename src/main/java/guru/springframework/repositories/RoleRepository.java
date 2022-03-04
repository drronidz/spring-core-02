package guru.springframework.repositories;

/*
PROJECT NAME : Spring Core Advanced - Beyond the Basics (Part 2)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/4/2022 2:21 PM
*/

import guru.springframework.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
