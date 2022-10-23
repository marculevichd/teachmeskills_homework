package com.example.teachmeskills_homework;

import java.util.LinkedHashMap;
import java.util.Map;


public class Homework {


    public static void main(String[] args) {

        Shop larek = new Shop();
        Products avocado = new Products(1, "avocado", 1000);
        Products kiwi = new Products(2, "kiwi", 500);
        Products apple = new Products(3, "apple", 2000);
        Products banana = new Products(4, "banana", 8948946);
        Products potato = new Products(5, "potato", 45646545);

        larek.addProductInList(avocado);
        larek.addProductInList(avocado);

        larek.addProductInList(kiwi);
        larek.addProductInList(apple);
        larek.addProductInList(banana);
        larek.addProductInList(potato);
//сортировка по цене

        larek.returnAllProducts();

        larek.removeProductFromList(1);


// не придумал как сделать перевод словаря в очередь с добавлением объектов

        larek.returnAllProducts();


        Products pineapple = new Products(9, "pineapple", 6666);
        larek.editProduct(pineapple);
        larek.returnAllProducts();

    }
}


class Products {
    Integer id;
    String name;
    Integer price;

    public Products(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


class Shop {

    public static Map listOfProduct = new LinkedHashMap();

    void addProductInList(Products product) {
        if (listOfProduct.containsKey(product.getId())) {
            System.out.println("Продукт с  Id" + product.getId() + " уже существует в списке товаров");
        } else {
            listOfProduct.put(product.getId(), product);
            System.out.println("Продукту " + product.getName() + " присовен ID" + product.getId() + ". Стоимость продукта: " + product.getPrice());
        }
    }


    void returnAllProducts() {
        System.out.println("Текущий список товаров: " + listOfProduct);
    }

    void removeProductFromList(int key) {
        listOfProduct.remove(key);
    }

    void editProduct(Products newProducts) {
        listOfProduct.clear();
        listOfProduct.put(newProducts.getId(), newProducts);
    }


}




