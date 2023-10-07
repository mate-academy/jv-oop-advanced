package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void printfInfoAboutFigure() {
        System.out.println("Figure: circle, area: " + Math.PI * radius * radius
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
