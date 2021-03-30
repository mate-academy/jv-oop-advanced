package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Random;

public class IsoscelesTrapezoid extends Shape implements ShapeBehaviour {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private DecimalFormat df = new DecimalFormat("####.##");

    private String name = "Isosceles Trapezoid";
    private String color = colorSupplier.randomColor();
    private int sideA = random.nextInt(20);
    private int sideB = random.nextInt(20);
    private int sideC = random.nextInt(20);
    private double diagonal = Math.sqrt((sideA * sideB) + Math.pow(sideC, 2));
    private double height = Math.sqrt(Math.pow(diagonal, 2)
            - Math.pow((sideA + sideB) / 2, 2));

    @Override
    public double findArea() {
        return (height / 2) * (sideA + sideB);
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.name).append(" , area: ")
                .append(df.format(this.findArea()))
                .append(" sq. units, height: ").append(df.format(this.height))
                .append(" , diagonal: ")
                .append(df.format(this.diagonal))
                .append(" , color: ").append(this.color);
        return sb.toString();
    }
}
