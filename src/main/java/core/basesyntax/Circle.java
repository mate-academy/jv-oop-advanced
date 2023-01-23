package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Colors color, Figures typeOfFigure, double radius) {
        super(color, typeOfFigure);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeOfFigure() + ", area: " + getSquare()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
