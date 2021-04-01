package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Shape {
    private DecimalFormat df = new DecimalFormat("####.##");
    private int sideA;
    private int sideB;
    private int sideC;
    private double diagonal;
    private double height;

    public IsoscelesTrapezoid(String name, String color, int sideA, int sideB, int sideC) {
        super(name,color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getDiagonal() {
        this.diagonal = Math.sqrt((this.sideA * this.sideB) + Math.pow(this.sideC, 2));
        return diagonal;
    }

    public double getHeight() {
        this.height = Math.sqrt((Math.pow(this.getDiagonal(), 2)
                - Math.pow((double)(this.sideA + this.sideB) / 2, 2)));
        return height;
    }

    @Override
    public double calculateArea() {
        return (this.getHeight() / 2) * (this.sideA + this.sideB);
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.getName()).append(" , area: ")
                .append(df.format(this.calculateArea()))
                .append(" sq. units, height: ").append(df.format(this.getHeight()))
                .append(" , diagonal: ")
                .append(df.format(this.getDiagonal()))
                .append(" , color: ").append(this.getColor());
        return sb.toString();
    }
}
