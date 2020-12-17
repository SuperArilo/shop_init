package com.superarilo.arilo.repository;

import com.superarilo.arilo.entity.Shop_Clothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface Shop_ClothesRepository extends JpaRepository<Shop_Clothes,Long>, JpaSpecificationExecutor<Shop_Clothes>
{
    Shop_Clothes findByClothesname(String clothesname);
    Shop_Clothes findByIdclothe(int idclothe);
}
