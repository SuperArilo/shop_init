package com.superarilo.arilo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_Shop_Car_Save
{
    @Id
    private String carclothesname;

    public String getCarclothesname() {
        return carclothesname;
    }

    public void setCarclothesname(String carclothesname) {
        this.carclothesname = carclothesname;
    }
}
