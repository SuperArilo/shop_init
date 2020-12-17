package com.superarilo.arilo.controller;

import com.superarilo.arilo.entity.Shop_Clothes;
import com.superarilo.arilo.entity.User_Shop_Car_Save;
import com.superarilo.arilo.repository.Shop_ClothesRepository;
import com.superarilo.arilo.repository.User_Shop_Car_SaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/del")
public class Shop_Car_Del
{
    @Autowired
    User_Shop_Car_SaveRepository user_shop_car_saveRepository;
    @Autowired
    Shop_ClothesRepository shop_clothesRepository;
    @PostMapping("/car")
    public String Del(@RequestBody User_Shop_Car_Save user_shop_car_save)
    {
        user_shop_car_saveRepository.delete(user_shop_car_save);
        return user_shop_car_save.getCarclothesname();
    }
    @PostMapping("/num")
    public String num_del(@RequestBody Shop_Clothes shop_clothes)
    {
        Shop_Clothes result = shop_clothesRepository.findByClothesname(shop_clothes.getClothesname());
        result.setCarclothesnum(shop_clothes.getCarclothesnum());
        shop_clothesRepository.save(result);
        return null;
    }
    @GetMapping("/all")
    public String Clearall()
    {
        for(int i = 1;i <= shop_clothesRepository.count();i++)
        {
            Shop_Clothes shop_clothes = shop_clothesRepository.findByIdclothe(i);
            shop_clothes.setCarclothesnum(null);
            shop_clothesRepository.save(shop_clothes);
        }
        user_shop_car_saveRepository.deleteAll();
        return "清除成功";
    }
}
