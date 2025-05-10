package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Shape {
    private DecimalFormat df = new DecimalFormat("####.##");
    private int sideA;
    private int sideB;
    private double hypotenuse;

    public RightTriangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotenuse = Math.sqrt(Math.pow(this.sideA,2) + Math.pow(this.sideB,2));
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
