package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getPrintInfo() {
        System.out.println("Figure: Circle, area: "
                + calculateArea() + " sq. units,  radius: "
                + radius + " units, color: " + getColor());
    }
}
