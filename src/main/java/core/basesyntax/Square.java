package core.basesyntax;

public class Square extends Figure {
    private double side;

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + this.getArea() + " sq. units, side: "
                + this.getSide() + " units, color: " + this.getColor());
    }
}
