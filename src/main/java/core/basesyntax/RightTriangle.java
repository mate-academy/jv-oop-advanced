package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Shape {

    Random rand;
    private int sideA;
    private int sideB;

    public RightTriangle(String name, String color, int sideA, int sideB){
        super(name,color);
        rand = new Random();
        this.sideA = rand.nextInt(10);
        this.sideB = rand.nextInt(15);
    }

    @Override
    public double calculateArea() {
        return 1/2 * sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 0.0;
    }

    @Override
    public void draw() {
    }

    @Override
    public String info() {
        return null;
    }

}
