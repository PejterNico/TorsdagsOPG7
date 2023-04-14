package Opg2;

import static java.lang.Math.PI;

public class Circle {

    private double radius;

    public Circle() {
        this.radius = 1;
    }

   public void setRadius(double radius) throws IllegalArgumentException {
        if (radius > 0) {
            this.radius = radius;
            getAreal();
        } else {
            throw new IllegalArgumentException("Dit tal er minus skriv et positivt tal");
        }
    }

    public double getAreal (){
        return (radius*radius)*PI;
    }

    @Override
    public String toString() {
        return ("Areal er: " + getAreal());
    }
}
