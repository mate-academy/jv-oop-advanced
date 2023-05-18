package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + FigureType.CIRCLE.getValue() + ", area: "
                + df.format(calculateArea()) + " sq.units, radius: " + this.radius + " units, "
                + " units, color: " + super.color);
    }

}
