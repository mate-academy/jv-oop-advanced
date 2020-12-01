package core.basesyntax;

import java.util.Random;

public class Square extends Shape{

    private Random rand;
    private int sideA;

    public Square(String name, String color) {
        super(name, color);
        rand = new Random();
        this.sideA = rand.nextInt(15);
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }

    @Override
    public double perimeter() {
        return sideA * 4;
    }

    @Override
    public void draw() {}

    public String info() {
        return null;
    }

}
