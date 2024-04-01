package com.data.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Friends, Integer>  {

}
