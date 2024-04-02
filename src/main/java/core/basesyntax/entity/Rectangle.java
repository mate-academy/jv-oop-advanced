package core.basesyntax.entity;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    public static final String TEXT_FIRST_LEG = "firstLeg: ";
    public static final String TEXT_SECOND_LEG = "secondLeg: ";
    public static final String TEXT_FIGURE = "Figure: right triangle, ";
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
        StringBuilder stringBuilder = new StringBuilder(TEXT_FIGURE);
        stringBuilder.append(TEXT_AREA)
                .append(Math.round(getArea() * 10.0) / 10.0).append(TEXT_SQ_UNITS)
                .append(TEXT_FIRST_LEG).append(firstLeg).append(TEXT_UNITS)
                .append(TEXT_SECOND_LEG).append(secondLeg).append(TEXT_UNITS)
                .append(TEXT_COLOR).append(getColor());
        System.out.println(stringBuilder.toString());
    }
}
