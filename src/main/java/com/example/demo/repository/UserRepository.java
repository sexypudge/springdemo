package com.example.demo.repository;

import com.example.demo.model.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Modifying
    @Query(value = "UPDATE USER_SPRING SET NAME = :name WHERE DATEADD(DAY,:expiryDuration, CREATED_AT) > GETDATE()", nativeQuery = true)
    Integer updateName(@Param("name") String name, @Param("expiryDuration") int expiryDuration);
}
