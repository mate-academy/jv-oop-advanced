package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Random;

public class IsoscelesTrapezoid extends Shape {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private DecimalFormat df = new DecimalFormat("####.##");

    private int sideA;
    private int sideB;
    private int sideC;
    private double diagonal;
    private double height;

    public IsoscelesTrapezoid() {
        this.setName("Isosceles Trapezoid");
        this.setColor(colorSupplier.randomColor());
        this.sideA = random.nextInt(20);
        this.sideB = random.nextInt(20);
        this.sideC = random.nextInt(20);
        this.diagonal = Math.sqrt((sideA * sideB) + Math.pow(sideC, 2));
        this.height = Math.sqrt(Math.pow(diagonal, 2));
    }

    @Override
    public double calculateArea() {
        return (height / 2) * (sideA + sideB);
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.getName()).append(" , area: ")
                .append(df.format(this.calculateArea()))
                .append(" sq. units, height: ").append(df.format(this.height))
                .append(" , diagonal: ")
                .append(df.format(this.diagonal))
                .append(" , color: ").append(this.getColor());
        return sb.toString();
    }
}
