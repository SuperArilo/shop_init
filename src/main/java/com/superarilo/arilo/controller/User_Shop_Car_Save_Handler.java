package com.superarilo.arilo.controller;

import com.superarilo.arilo.entity.Shop_Clothes;
import com.superarilo.arilo.entity.User_Data;
import com.superarilo.arilo.entity.User_Shop_Car_Save;
import com.superarilo.arilo.repository.Shop_ClothesRepository;
import com.superarilo.arilo.repository.User_Shop_Car_SaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Shop_Car")
public class User_Shop_Car_Save_Handler
{
    @Autowired
    private User_Shop_Car_SaveRepository user_shop_car_saveRepository;
    @Autowired
    private Shop_ClothesRepository shop_clothesRepository;
    @PostMapping("/Save_Clothesname")
    public String Shop_Car_Save(@RequestBody User_Shop_Car_Save user_shop_car_save)
    {
        User_Shop_Car_Save result = user_shop_car_saveRepository.findByCarclothesname(user_shop_car_save.getCarclothesname());
        if (result != null)
        {
            return "该商品已在购物车里！";
        }
        else {
            User_Shop_Car_Save result_save = user_shop_car_saveRepository.save(user_shop_car_save);
            if (result_save != null)
            {
                return String.valueOf(user_shop_car_saveRepository.count());
            }
            else
            {
                return "添加失败！";
            }
        }
    }
    @PostMapping("/Save_Clothesnum")
    public String Save_Clothesnum(@RequestBody Shop_Clothes shop_clothes)
    {
        Shop_Clothes result = shop_clothesRepository.findByClothesname(shop_clothes.getClothesname());
        result.setCarclothesnum(shop_clothes.getCarclothesnum());
        shop_clothesRepository.save(result);
        return null;
    }
    @GetMapping("/all")
    public int Show_all()
    {
       return Math.toIntExact(user_shop_car_saveRepository.count());
    }
}
