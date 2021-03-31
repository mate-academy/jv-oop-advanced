package core.basesyntax;

import java.util.Random;

public class Square extends Shape {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private int sideA;

    public Square() {
        this.setName("Square");
        this.setColor(colorSupplier.randomColor());
        this.sideA = random.nextInt(20);
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.sideA, 2);
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.getName()).append(" , area: ")
                .append(this.calculateArea())
                .append(" sq. units, All sides equals: ").append(this.sideA)
                .append(" , color: ").append(this.getColor());
        return sb.toString();
    }
}
