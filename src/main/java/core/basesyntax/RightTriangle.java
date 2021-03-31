package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Random;

public class RightTriangle extends Shape implements CalculateArea {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private DecimalFormat df = new DecimalFormat("####.##");

    private int sideA;
    private int sideB;
    private double hypotenuse;

    public RightTriangle() {
        this.setName("Triangle");
        this.setColor(colorSupplier.randomColor());
        this.sideA = random.nextInt(20);
        this.sideB = random.nextInt(20);
        this.hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    @Override
    public double calculateArea() {
        return (this.sideA * this.sideB) / 2;
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.getName()).append(" , area: ")
                .append(this.calculateArea())
                .append(" sq. units, hypotenuse: ").append(df.format(this.hypotenuse))
                .append(" , color: ").append(this.getColor());
        return sb.toString();
    }
}
