package core.basesyntax;

public class Rectangle extends  Figure implements Draw{
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {

    }
}
