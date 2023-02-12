package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    private double side;
    private Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        area = side * side;
        return area;
    }

    @Override
    public String drawFigure() {
        System.out.println("Figure: square, "
                + "area: " + Math.floor(area) + " sq.units, "
                + "side: " + side + " units"
                + ", color: " + color.toString().toLowerCase());
        return null;
    }

}
