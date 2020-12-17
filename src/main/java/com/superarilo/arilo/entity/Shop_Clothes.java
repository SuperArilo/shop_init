package com.superarilo.arilo.entity;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Shop_Clothes
{
    @Id
    private int idclothe;
    private String clothespicturebe;
    private String clothespictureaf;
    private String clothesname;
    private double clothespricebefore;
    private double clothespriceafter;
    private double clothessale;
    private String clothessize;
    private String clothescolor;
    private String clothesfrom;
    private String clothesmade;
    private String carclothesnum;

    public String getClothesname() {
        return clothesname;
    }

    public void setClothesname(String clothesname) {
        this.clothesname = clothesname;
    }

    public double getClothespricebefore() {
        return clothespricebefore;
    }

    public void setClothespricebefore(double clothespricebefore) {
        this.clothespricebefore = clothespricebefore;
    }

    public double getClothespriceafter() {
        return clothespriceafter;
    }

    public void setClothespriceafter(double clothespriceafter) {
        this.clothespriceafter = clothespriceafter;
    }

    public double getClothessale() {
        return clothessale;
    }

    public void setClothessale(double clothessale) {
        this.clothessale = clothessale;
    }

    public String getClothespicturebe() {
        return clothespicturebe;
    }

    public void setClothespicturebe(String clothespicturebe) {
        this.clothespicturebe = clothespicturebe;
    }

    public String getClothespictureaf() {
        return clothespictureaf;
    }

    public void setClothespictureaf(String clothespictureaf) {
        this.clothespictureaf = clothespictureaf;
    }

    public String getClothessize() {
        return clothessize;
    }

    public void setClothessize(String clothessize) {
        this.clothessize = clothessize;
    }

    public String getClothescolor() {
        return clothescolor;
    }

    public void setClothescolor(String clothescolor) {
        this.clothescolor = clothescolor;
    }

    public String getClothesfrom() {
        return clothesfrom;
    }

    public void setClothesfrom(String clothesfrom) {
        this.clothesfrom = clothesfrom;
    }

    public String getClothesmade() {
        return clothesmade;
    }

    public void setClothesmade(String clothesmade) {
        this.clothesmade = clothesmade;
    }

    public int getIdclothe() {
        return idclothe;
    }

    public void setIdclothe(int idclothe) {
        this.idclothe = idclothe;
    }

    public String getCarclothesnum() {
        return carclothesnum;
    }

    public void setCarclothesnum(String carclothesnum) {
        this.carclothesnum = carclothesnum;
    }
}
