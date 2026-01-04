package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + String.format(java.util.Locale.US,"%.2f", getArea())
                + " sq. units, side: "
                + side
                + " units, color: "
                + color);
    }
}
