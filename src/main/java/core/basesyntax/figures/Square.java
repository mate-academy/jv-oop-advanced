package core.basesyntax.figures;

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
        return Math.pow(side, 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getFigureName() + ", " + "area: " + getArea()
                + " sq.units, side: " + getSide() + ", color: " + getColor());
    }
}
