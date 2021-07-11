package core.basesyntax.figures;

import core.basesyntax.util.Figure;

public class RightTriangle extends Figure {
    private Double legA;
    private Double legB;

    public RightTriangle() {
    }

    public Double getLegA() {
        return legA;
    }

    public void setLegA(Double legA) {
        this.legA = legA;
    }

    public Double getLegB() {
        return legB;
    }

    public void setLegB(Double legB) {
        this.legB = legB;
    }

    @Override
    public double getArea() {
        return 0.5 * getLegA() + getLegB();
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + ", legA: "
                + getLegA() + ", legB: " + getLegB() + ", color: " + getColor());

    }
}
