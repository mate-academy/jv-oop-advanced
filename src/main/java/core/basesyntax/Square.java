package core.basesyntax;

public class Square extends Figure {
    private double sideA;

    public Square(double sideA, String color) {
        this.sideA = sideA;
        setColor(color);
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + sideA + " units, color: " + getColor());
    }
}
