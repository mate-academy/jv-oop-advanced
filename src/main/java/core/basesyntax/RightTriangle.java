package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(double side, String color) {
        this.side = side;
        super.color = color;
    }

    @Override
    public double getArea() {

        return side * side * Math.sqrt(3) / 4;
    }

    public void drawFigure() {
        System.out.println("Figure: IsoscelesTrapezoid, Area: " + this.getArea() + " side: "
                + this.side + " color:" + super.color);
    }
}
