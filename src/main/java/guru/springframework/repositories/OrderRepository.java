package guru.springframework.repositories;

/*
PROJECT NAME : Spring Core Advanced - Beyond the Basics (Part 2)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 3/4/2022 2:18 PM
*/

import guru.springframework.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
