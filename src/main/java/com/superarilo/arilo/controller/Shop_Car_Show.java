package com.superarilo.arilo.controller;

import com.superarilo.arilo.entity.Shop_Clothes;
import com.superarilo.arilo.entity.User_Shop_Car_Save;
import com.superarilo.arilo.repository.Shop_ClothesRepository;
import com.superarilo.arilo.repository.User_Shop_Car_SaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Show")
public class Shop_Car_Show
{
    @Autowired
    private User_Shop_Car_SaveRepository user_shop_car_saveRepository;
    @Autowired
    private Shop_ClothesRepository shop_clothesRepository;
    @GetMapping("/find")
    public List<Shop_Clothes> finAll()
    {
        List<User_Shop_Car_Save> user = user_shop_car_saveRepository.findAll();
        List<Shop_Clothes> all = new ArrayList<>();
        for (User_Shop_Car_Save user_shop_car_save : user)
        {
            String carclothesname = user_shop_car_save.getCarclothesname();
            Shop_Clothes shop_clothes = shop_clothesRepository.findByClothesname(carclothesname);
            all.add(shop_clothes);
        }
        return all;
    }
    @RequestMapping("/Order")
    public List<Shop_Clothes> My_Order()
    {
        List<User_Shop_Car_Save> user_all = user_shop_car_saveRepository.findAll();
        List<Shop_Clothes> return_all = new ArrayList<>();
        for (User_Shop_Car_Save user_shop_car_save : user_all)
        {
            String carclothesname = user_shop_car_save.getCarclothesname();
            Shop_Clothes shop_clothes = shop_clothesRepository.findByClothesname(carclothesname);
            return_all.add(shop_clothes);
        }
        return return_all;
    }
}
