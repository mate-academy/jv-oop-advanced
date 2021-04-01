package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(String color, String figuresName, double side) {
        super(color, figuresName);
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((Math.sqrt(3) * side * side) / 4);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, sides length: " + side + " units, color: " + getColor());
    }
}
