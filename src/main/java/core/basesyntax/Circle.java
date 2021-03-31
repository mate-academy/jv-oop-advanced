package core.basesyntax;

public class Circle extends Shape {
    private int radius;
    private int diameter;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.name = name;
        this.color = color;
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
        sb.append("Figure: ").append(this.name)
                .append(" , area: ").append(this.calculateArea())
                .append("sq. units, diameter: ")
                .append(this.diameter).append(" , color: ").append(this.color);
        return sb.toString();
    }
}
