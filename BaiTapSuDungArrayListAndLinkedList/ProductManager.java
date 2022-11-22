package BaiTapSuDungArrayListAndLinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    private ArrayList<Product> listProduct;

    public ProductManager() {
        listProduct = new ArrayList<>();
    }

    public void addProduct (Product product){
        listProduct.add(product);
    }
    public boolean removeProduct ( String idProduct){
        for (Product product: listProduct
             ) {
            if ( product.getIdProduct().equals(idProduct)){
                listProduct.remove(product);
                return true;
            }
        }
        return false;
    }

    public boolean fixProduct(String idProduct, String idSanPham, String nameSanPham,int priceSanPham){
        for (Product product: listProduct
             ) {
            if ( product.getIdProduct().equals(idProduct)){
                product.setIdSanPham(idSanPham);
                product.setNameSanPham(nameSanPham);
                product.setPriceSanPham(priceSanPham);
                return true;
            }
        }
        return false;
    }

    public void display(){
        System.out.println(listProduct);
    }

    public void searchByName(String nameSanPham){
        ArrayList<Product> listName = new ArrayList<>();
        for (Product product: listProduct
        ) {
            if ( product.getNameSanPham().equals(nameSanPham)){
               listName.add(product);
            }
        }
        System.out.println(listName);
    }

    public void sortProductIncreaseByPrice(){
        ComparatorProduct comparatorProduct = new ComparatorProduct();

        listProduct.sort(comparatorProduct);
        System.out.println(listProduct);
    }

    public void sortProductDecreaseByPrice(){
        ComparatorProduct comparatorProduct = new ComparatorProduct();
        Collections.sort(listProduct,comparatorProduct.reversed());
        System.out.println(listProduct);
    }


    @Override
    public String toString() {
        return "ProductManager{" +
                "listProduct=" + listProduct +
                '}';
    }
}
