package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure : " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + String.format("%.2f", getArea())
                + " sq.units, radius: " + radius + " units, color: "
                + getColor());
    }
}
