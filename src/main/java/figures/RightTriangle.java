package figures;

import randomiser.Color;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getSquare() {
        return (firstLeg + secondLeg) / 2;
    }

    @Override
    public double getPerimeter() {
        return firstLeg + secondLeg + getHypotenuse();
    }

    private double getHypotenuse() {
        return Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(firstLeg, 2));
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: right triangle, area: %.2f sq.units, first side %.2f units, "
                + "second side %.2f units, hypotenuse %.2f units, color: %s",
                getSquare(), getFirstLeg(), getSecondLeg(), getHypotenuse(), getColor());
    }
}
