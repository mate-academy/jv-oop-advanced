package core.basesyntax;

public class Square extends Figure {
    private double side;
    private double area;

    public Square(double side, Color color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void drawTheInformation() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq.units, side: " + side + "units, color: " + getColor());
    }
}
