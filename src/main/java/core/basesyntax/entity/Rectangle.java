package core.basesyntax.entity;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: right triangle, ");
        stringBuilder.append("area: ")
                .append(Math.round(getArea() * 10.0) / 10.0).append(" sq. units, ")
                .append("firstLeg: ").append(firstLeg).append(" units, ")
                .append("secondLeg: ").append(secondLeg).append(" units, ")
                .append("color: ").append(getColor());
        System.out.println(stringBuilder.toString());
    }
}
