package com.michalszekalski.bootcamp_zad27;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserCustom, Long> {
}
