package com.superarilo.arilo.repository;

import com.superarilo.arilo.entity.User_Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User_Data,Long>, JpaSpecificationExecutor<User_Data>
{
    User_Data findByUseremailAndUserpwd(String useremail,String userpwd);
}
