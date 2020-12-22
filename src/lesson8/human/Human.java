package lesson8.human;

import lesson8.human.jackets.*;
import lesson8.human.pants.*;
import lesson8.human.shoes.*;

public class Human  {
    private String name;
    private HJacket jacket;
    private HPants pants;
    private HShoes shoes;

    public Human(String name, HJacket jacket, HPants pants, HShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Human() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HJacket getJacket() {
        return jacket;
    }

    public void setJacket(HJacket jacket) {
        this.jacket = jacket;
    }

    public HPants getPants() {
        return pants;
    }

    public void setPants(HPants pants) {
        this.pants = pants;
    }

    public HShoes getShoes() {
        return shoes;
    }

    public void setShoes(HShoes shoes) {
        this.shoes = shoes;
    }


    public void dressUp() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }


    public void dressOff() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
