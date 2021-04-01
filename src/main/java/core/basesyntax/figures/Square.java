package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawable;
import core.basesyntax.Figure;

public class Square extends Figure implements Drawable, AreaCalculator {

    private Double sideA;

    public Square(String color, double sideA) {
        this.sideA = sideA;
        setColor(color);
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public double getArea() {
        return getSideA() * getSideA();
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq. units, side length: "
                + getSideA() + " units, color: " + getColor();
    }
}
