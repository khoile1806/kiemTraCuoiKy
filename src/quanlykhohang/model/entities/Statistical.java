package quanlykhohang.model.entities;

import java.util.*;

public class Statistical {
    public static void total(Map<String,Product> mapProduct){
        int price = 0;
        int quantity = 0;
        int inventory = 0;
        for(Map.Entry<String,Product> entry : mapProduct.entrySet()){
            if(entry.getValue().getQuantity()>0){
                price += entry.getValue().getPrice()*(entry.getValue().getQuantity() + entry.getValue().getInventory());
                quantity += (entry.getValue().getQuantity());
                inventory += (entry.getValue().getInventory());
            }
        }
        System.out.println("==> Total products imported: " + inventory);
        System.out.println("==> total quantity in stock: " + quantity);
        System.out.println("==> Total inventory value: " + price);
    }

    public static void toltalProducts(Map<String,Product> mapProduct){
        int food = 0;
        int Ceramic = 0;
        int Electrical = 0;

        for(Map.Entry<String,Product> entry : mapProduct.entrySet()){
            if(entry.getValue().getType().equalsIgnoreCase("FD")){
                food += (entry.getValue().getQuantity() + entry.getValue().getInventory());
            }
            if(entry.getValue().getType().equalsIgnoreCase("CE")){
                Ceramic += (entry.getValue().getQuantity() + entry.getValue().getInventory());
            }
            if(entry.getValue().getType().equalsIgnoreCase("EL")){
                Electrical += (entry.getValue().getQuantity() + entry.getValue().getInventory());
            }
        }
        System.out.println("==> total quantity of food in stock: " + food);
        System.out.println("==> total quantity of Ceramic in stock: " + Ceramic);
        System.out.println("==> total quantity of Electrical in stock: " + Electrical);
    }
}
