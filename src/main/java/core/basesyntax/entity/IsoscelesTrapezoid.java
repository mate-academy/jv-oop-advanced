package core.basesyntax.entity;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    public static final String ABOVE_BASE = "aboveBase: ";
    public static final String BOTTOM_BASE = "bottomBase: ";
    public static final String HEIGHT = "height: ";
    public static final String FIGURE_RIGHT_TRIANGLE = "Figure: right triangle, ";
    private int aboveBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int aboveBase, int bottomBase, int height) {
        super(color);
        this.aboveBase = aboveBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((aboveBase + bottomBase) * height) / 2;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder(FIGURE_RIGHT_TRIANGLE);
        stringBuilder.append(TEXT_AREA)
                .append(Math.round(getArea() * 10.0) / 10.0).append(TEXT_SQ_UNITS)
                .append(ABOVE_BASE).append(aboveBase).append(TEXT_UNITS)
                .append(BOTTOM_BASE).append(bottomBase).append(TEXT_UNITS)
                .append(HEIGHT).append(height).append(TEXT_UNITS)
                .append(TEXT_COLOR).append(getColor());
        System.out.println(stringBuilder.toString());
    }
}
