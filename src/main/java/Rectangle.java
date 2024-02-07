public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, side 1: " + side1 + " units, side 2: "
                + side2 + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
}
