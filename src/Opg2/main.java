package Opg2;

public class main {

    public static void main(String[] args) {

        Circle c = new Circle();
        try {
            c.setRadius(-3);
        } catch (IllegalArgumentException e){
            System.out.println(e);
            c.setRadius(3);
        }
        System.out.println(c);

    }
}
