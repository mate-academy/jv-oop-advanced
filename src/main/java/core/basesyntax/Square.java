package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
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
        System.out.println("square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: ");
    }
}
