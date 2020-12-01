package core.basesyntax;

import java.util.Random;

public class Square extends Shape{

    private Random rand;
    private StringBuilder sb = new StringBuilder();
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
        return sb.append("Shape: ").append(super.getName()+ ", ").append("area: " + this.calculateArea() + " sq.units")
               .append("side length: " + this.sideLength() + " units ")
                .append("color: " + super.getColor()).toString();
    }

    public double sideLength() {
        return perimeter() / 4;
    }
}
