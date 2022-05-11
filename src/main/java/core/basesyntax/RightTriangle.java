package core.basesyntax;

public class RightTriangle extends Figure {
    public RightTriangle(String color, double sideA) {
        super(color);

    }

    @Override
    public double getAreaCalculator() {
        return getSideA() * getSideA() * Math.sqrt(3) / 4;
    }

    @Override
    public String getDrawable() {
        return "Figure : isoscelesTriangle, area: " + getAreaCalculator() + " sq.units, side: "
                + getSideA() + " units, color: "
                + getColor();
    }
}
