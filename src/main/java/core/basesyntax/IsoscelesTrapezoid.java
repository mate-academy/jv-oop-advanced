package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Shape {

    private Random rand;
    private StringBuilder sb = new StringBuilder();
    private int sideA;
    private int sideB;
    private int sideC;

    public IsoscelesTrapezoid(String name) {
        super(name);
        rand = new Random();
        this.sideA = rand.nextInt(10);
        this.sideB = rand.nextInt(20);
        this.sideC = rand.nextInt(15);
    }

    @Override
    public double calculateArea() {
        return this.averageLine() * this.height();
    }

    @Override
    public double perimeter() {
        return 2 * sideC + sideA + sideB;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Isosceles Trapezoid");
    }

    @Override
    public String info() {
        return sb.append(super.info()).append(",area: " + this.calculateArea() + " sq.units ")
                .append("height: " + this.height() + " units ").toString();
    }

    public double averageLine() {
        return (sideB + sideA) / 2;
    }

    public double height() {
        return Math.sqrt((sideC * sideC) - 1 / 4 * ((sideB * sideB) - (sideA * sideA)));
    }
}
