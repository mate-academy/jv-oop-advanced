package core.basesyntax.entity;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        double area = (firstLeg * secondLeg) / 2;
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: right triangle, ");
        stringBuilder.append("area: ").append(getArea()).append(" sq. units, ")
                .append("firstLeg: ").append(firstLeg).append(" units, ")
                .append("secondLeg: ").append(secondLeg).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(stringBuilder.toString());
    }
}
