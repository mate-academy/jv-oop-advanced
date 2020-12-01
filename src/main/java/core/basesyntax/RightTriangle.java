package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Shape {

    private Random rand;
    private StringBuilder sb = new StringBuilder();
    private int sideA;
    private int sideB;

    public RightTriangle(String name) {
        super(name);
        rand = new Random();
        this.sideA = rand.nextInt(10);
        this.sideB = rand.nextInt(15);
    }

    @Override
    public double calculateArea() {
        return 1 / 2 * sideA * sideB;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + getHypotenuse();
    }

    @Override
    public void draw() {
        System.out.println("Drawing Right Triangle");
    }

    @Override
    public String info() {
        return sb.append(super.info()).append("area: " + this.calculateArea() + " sq.units ")
        .append("hypotenuse: " + this.getHypotenuse() + " units ").toString();
    }

    public double getHypotenuse() {
        return (int)(Math.sqrt((sideA * sideA) + (sideB * sideB)));
    }
}
