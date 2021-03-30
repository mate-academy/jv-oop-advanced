package core.basesyntax;

import java.util.Random;

public class Circle extends Shape implements ShapeBehaviour {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private String name = "Circle";
    private String color = colorSupplier.randomColor();
    private int radius = random.nextInt(20);
    private int diameter = radius * 2;

    @Override
    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.name).append(" , area: ").append(this.findArea())
                .append("sq. units, diameter: ")
                .append(this.diameter).append(" , color: ").append(this.color);
        return sb.toString();
    }
}
