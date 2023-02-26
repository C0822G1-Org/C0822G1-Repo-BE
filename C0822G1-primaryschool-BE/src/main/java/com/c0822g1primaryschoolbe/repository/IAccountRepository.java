package com.c0822g1primaryschoolbe.repository;

import com.c0822g1primaryschoolbe.entity.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAccountRepository extends JpaRepository<Account,Long> {
    @Query(value = "select * from account where username = :username", nativeQuery = true)
    Optional<Account> findByUsername(@Param("username") String username);
}
