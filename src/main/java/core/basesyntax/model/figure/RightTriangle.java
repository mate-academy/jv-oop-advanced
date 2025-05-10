package core.basesyntax.model.figure;

import core.basesyntax.model.Color;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        String area = this.doubleToString(getArea());
        String status = new StringBuilder()
                .append("Figure: right triangle, area: ")
                .append(area)
                .append(" sq.units, firstLeg: ")
                .append(firstLeg)
                .append(" units, secondLeg: ")
                .append(secondLeg)
                .append(" units, color: ")
                .append(getColor()).toString();
        System.out.println(status);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
