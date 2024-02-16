package core.basesyntax;

public class Circle extends ColorsOfFigures {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq. units, radius: " + radius + " units, color: " + getColor());
    }
}
