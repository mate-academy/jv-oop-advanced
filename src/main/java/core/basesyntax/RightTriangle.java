package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Random;

public class RightTriangle extends Shape implements ShapeBehaviour {

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private DecimalFormat df = new DecimalFormat("####.##");

    private String name = "Triangle";
    private String color = colorSupplier.randomColor();
    private int sideA = random.nextInt(20);
    private int sideB = random.nextInt(20);
    private double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

    @Override
    public double findArea() {
        return (this.sideA * this.sideB) / 2;
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.name).append(" , area: ").append(this.findArea())
                .append(" sq. units, hypotenuse: ").append(df.format(this.hypotenuse))
                .append(" , color: ").append(this.color);
        return sb.toString();
    }
}
