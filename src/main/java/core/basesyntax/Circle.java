package core.basesyntax;

public class Circle extends Figure implements Area {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                +
                getArea()
                +
                " sq.units, radius: "
                +
                radius
                +
                " units, color: "
                +
                getColor());
    }
}
