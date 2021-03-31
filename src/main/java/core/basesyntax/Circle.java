package core.basesyntax;

import java.util.Random;

public class Circle extends Shape implements CalculateArea {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private int radius;
    private int diameter;

    public Circle() {
        this.setName("Circle");
        this.setColor(colorSupplier.randomColor());
        this.radius = random.nextInt(20);
        this.diameter = radius * 2;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.getName())
                .append(" , area: ").append(this.calculateArea())
                .append("sq. units, diameter: ")
                .append(this.diameter).append(" , color: ").append(this.getColor());
        return sb.toString();
    }
}
