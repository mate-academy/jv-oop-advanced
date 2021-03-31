package core.basesyntax.figures;

import core.basesyntax.*;

public class RightTriangle extends Figure implements Draw, Area {

    private Double sideA;
    private String color;

    public RightTriangle(String color, double sideA) {
        this.sideA = sideA;;
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
        return  (Math.cbrt(3) / 4 * getSideA());
    }


    @Override
    public String getDraw() {
        return "Figure: right triangle, area: " + getArea() + " sq. units, side length: " + getSideA() + " units, color: " + getColor();
    }
}
