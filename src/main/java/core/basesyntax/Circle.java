package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, String color, double radius) {
        super.name = name;
        super.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: " + name + ", area: "
                + getArea() + " sq.units, radius: " + radius
                + " units, color: " + color);
    }
}
