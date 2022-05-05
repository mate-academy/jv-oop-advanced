package core.basesyntax;

public class IsoscelesTriangle extends Figure {
    public IsoscelesTriangle(String color,double sideA) {
        super(color);

    }

    @Override
    public double getAreaCalculator() {
        return getSideA() * getSideA() * Math.sqrt(3) / 4;
    }

    @Override
    public String getDrawable() {
        return "Figure : IsoscelesTriangle, area: " + getAreaCalculator() + " sq.units, side: "
                + getSideA() + " units, color: "
                + getColor();
    }
}
