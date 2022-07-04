package core.basesyntax;

public class Square extends Figure {
    private double sideA;

    Square(double sideA, Color color) {
        super(color);
        this.sideA = sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public double getArea() {
        return Math.pow(sideA, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea()
                + " sq.units, side: " + sideA + " units, color: " + getColor());
    }
}
