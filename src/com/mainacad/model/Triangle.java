package com.mainacad.model;

public class Triangle extends AbstractShape{

    private double base;

    private double hight;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return (base * hight) / 2;
    }

    public Triangle(double base, double hight) {
        this.base = base;
        this.hight = hight;
    }

    public Triangle() {
    }
}

