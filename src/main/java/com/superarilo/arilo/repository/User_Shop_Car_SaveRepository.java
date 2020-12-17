package com.superarilo.arilo.repository;

import com.superarilo.arilo.entity.User_Shop_Car_Save;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.transaction.Transactional;
@Transactional
public interface User_Shop_Car_SaveRepository extends JpaRepository<User_Shop_Car_Save,Long>, JpaSpecificationExecutor<User_Shop_Car_Save>
{
    User_Shop_Car_Save findByCarclothesname(String carclothesname);
}
