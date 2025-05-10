package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: Circle, area: "
                + calculateArea() + " sq. units,  radius: "
                + radius + " units, color: " + getColor());
    }
}
