package core.basesyntax;

public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String message = "Figure: square, area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor();
        System.out.println(message);
    }
}
