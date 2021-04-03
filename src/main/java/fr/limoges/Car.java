package fr.limoges;

import org.springframework.stereotype.Component;

public class Car implements Vehicule {
    public void drive(){
        System.out.println("i'm driving a car");
    }
}
