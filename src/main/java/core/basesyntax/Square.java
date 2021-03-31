package core.basesyntax;

public class Square extends Figure implements Drawable {
    private double side = Math.random() * 10;

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
    public String drawFigure() {
        return "Figure: square, area: " + String.format("%.1f", getArea())
                + " sq. units, side length: " + String.format("%.1f", side)
                + " units, color:" + getColor();
    }
}
