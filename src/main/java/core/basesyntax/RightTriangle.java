package core.basesyntax;

public class RightTriangle extends Figure {

    private double sideA;

    public RightTriangle(String color, double sideA) {
        super(color);
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA * Math.sqrt(3) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure : isoscelesTriangle, area: " + getArea() + " sq.units, side: "
                + sideA + " units, color: "
                + getColor());
    }
}
