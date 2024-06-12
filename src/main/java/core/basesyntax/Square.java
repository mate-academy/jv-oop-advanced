package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        double area = calculateArea();
        System.out.println("Figure: square, area: " + area + " sq. units, side: "
                + getSide() + " units, color: " + getColor());
    }

    public double getSide() {
        return side;
    }
}
