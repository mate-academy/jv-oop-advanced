package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2) * Math.sqrt(3) / 4;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + calculateArea() + " sq. units, side: "
                + getSide() + " units, color: " + getColor());
    }

    public double getSide() {
        return side;
    }
}
