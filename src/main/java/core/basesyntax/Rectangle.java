package core.basesyntax;

import java.util.Random;

public class Rectangle extends Shape implements AreaCalculator {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private int sideA;
    private int sideB;

    public Rectangle() {
        this.setName("Rectangle");
        this.setColor(colorSupplier.randomColor());
        this.sideA = random.nextInt(20);
        this.sideB = random.nextInt(20);
    }

    @Override
    public double calculateArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.getName()).append(" , area: ")
                .append(this.calculateArea())
                .append(" , color: ").append(this.getColor());
        return sb.toString();
    }
}
