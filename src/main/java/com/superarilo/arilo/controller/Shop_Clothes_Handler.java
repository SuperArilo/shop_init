package com.superarilo.arilo.controller;

import com.superarilo.arilo.entity.Shop_Clothes;
import com.superarilo.arilo.repository.Shop_ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Shop_Clothes")
public class Shop_Clothes_Handler
{
    @Autowired
    private Shop_ClothesRepository shop_clothesRepository;
    @GetMapping("/finAll")
    public List<Shop_Clothes> finAll()
    {
        return shop_clothesRepository.findAll();
    }
    @GetMapping("/row_num")
    public long Row_num()
    {
        System.out.println(shop_clothesRepository.count());
        return shop_clothesRepository.count();
    }
}
