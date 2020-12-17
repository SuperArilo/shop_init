package com.superarilo.arilo.controller;

import com.superarilo.arilo.entity.Shop_Clothes;
import com.superarilo.arilo.repository.Shop_ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Change")
public class Shop_Car_Input_Value_Change
{
    @Autowired
    Shop_ClothesRepository shop_clothesRepository;
    @PostMapping("/num")
    public String Change(@RequestBody Shop_Clothes shop_clothes)
    {
        Shop_Clothes result = shop_clothesRepository.findByIdclothe(shop_clothes.getIdclothe());
        result.setCarclothesnum(shop_clothes.getCarclothesnum());
        shop_clothesRepository.save(result);
        return null;
    }
}
