package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Shape {
    private DecimalFormat df = new DecimalFormat("####.##");

    private int radius;
    private int diameter;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
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
                .append(" , area: ").append(df.format(this.calculateArea()))
                .append(" sq. units, diameter: ")
                .append(this.diameter).append(" , color: ").append(this.getColor());
        return sb.toString();
    }
}
