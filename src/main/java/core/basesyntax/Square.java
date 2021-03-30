package core.basesyntax;

import java.util.Random;

public class Square extends Shape implements ShapeBehaviour {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private String name = "Square";
    private String color = colorSupplier.randomColor();
    private int sideA = random.nextInt(20);

    @Override
    public double findArea() {
        return Math.pow(this.sideA, 2);
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.name).append(" , area: ").append(this.findArea())
                .append(" sq. units, All sides equals: ").append(this.sideA)
                .append(" , color: ").append(this.color);
        return sb.toString();
    }
}
