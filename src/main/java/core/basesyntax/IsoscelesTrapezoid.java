package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid  extends Shape {

    Random rand;
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid(String name, String color){
        super(name, color);
        rand = new Random();
        this.sideA = rand.nextInt(10);
        this.sideB = rand.nextInt(20);
        this.sideC = rand.nextInt(15);
    }

    @Override
    public double calculateArea() {
        return 0.0;
    }

    @Override
    public double perimeter() {
        return 2 * sideC + sideA + sideB;
    }

    @Override
    public void draw() {}

    @Override
    public String info() {
        return null;
    }
}
