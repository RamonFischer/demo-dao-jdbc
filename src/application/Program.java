package application;

import entitities.Department;
import entitities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Department obj = new Department(1,"books");
        System.out.println(obj);
        Seller seller = new Seller(1,"Ramon","ramon@gmail",new Date(),300.0,obj);
        System.out.println(seller);
    }
}
