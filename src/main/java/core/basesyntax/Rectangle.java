package core.basesyntax;

import java.util.Random;

public class Rectangle extends Shape implements ShapeBehaviour {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private String name = "Rectangle";
    private String color = colorSupplier.randomColor();
    private int sideA = random.nextInt(20);
    private int sideB = random.nextInt(20);

    @Override
    public double findArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.name).append(" , area: ").append(this.findArea())
                .append(" , color: ").append(this.color);
        return sb.toString();
    }
}
