package BaiTapSuDungArrayListAndLinkedList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1","001","Gao",5000);
        Product product2 = new Product("2","002","Keo",1000);
        Product product3 = new Product("3","004","NuocNgot",8000);
        Product product4 = new Product("4","007","GiaVi",3500);

        ProductManager productManager = new ProductManager();
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);
        productManager.display();

        productManager.removeProduct("3");
        System.out.println("Sau khi xoa 3:");
        productManager.display();

        productManager.fixProduct("2","005","TraiCay",7500);
        System.out.println("Sau khi sua 2: ");
        productManager.display();

        System.out.println("Tim ten:");
        productManager.searchByName("Gao");

        System.out.println("Sap xep theo gia tang dan:");
        productManager.sortProductIncreaseByPrice();

        System.out.println("Sap xep theo gia giam dan:");
        productManager.sortProductDecreaseByPrice();

    }
}
