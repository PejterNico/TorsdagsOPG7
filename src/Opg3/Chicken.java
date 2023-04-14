package Opg3;

abstract class Chicken extends Animal implements Edible {
    @Override
    public String sound(){
        return "cuk";
    }
    @Override
    public String howToEat(){
        return "cook before eating";
    }
}
