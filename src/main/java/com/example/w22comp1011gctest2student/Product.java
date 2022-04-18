package com.example.w22comp1011gctest2student;

public class Product {
  public int id;
  public String sku;
  public String name;
  public String salesPrice;
  public String regularPrice;
  public String image;

  public int getId() {
    return id;
  }

  public String getSku() {
    return sku;
  }

  public String getName() {
    return name;
  }

  public String getSalesPrice() {
    return salesPrice;
  }

  public String getRegularPrice() {
    return regularPrice;
  }

  public String getImage() {
    return image;
  }

  @Override
  public String toString() {
    return " name=" + name + '\'' +
            ", salesPrice='" + salesPrice + '\'' ;
  }
}
