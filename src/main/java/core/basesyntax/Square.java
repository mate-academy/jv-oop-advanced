package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSite(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double scale = Math.pow(10, 2);
        double area = side * side;
        return Math.ceil(area * scale) / scale;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, " + "area: " + getArea() + " sq.units, side: "
                + (int)side + " units, color: " + getColor());
    }
}
