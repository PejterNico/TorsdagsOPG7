package Opg2;

import static java.lang.Math.PI;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getAreal (){
        return (radius*radius)*PI;
    }

    @Override
    public String toString() {
        return ("Areal er: " + getAreal());
    }
}
