package core.basesyntax;

import java.text.DecimalFormat;

public abstract class Figure implements QuadrangularArea, TriangleArea {
    protected static final String DECIMAL_FORMAT_PATTERN = "#.00";
    protected DecimalFormat decimalFormat = new DecimalFormat(DECIMAL_FORMAT_PATTERN);

    protected String color;
    protected TypeOfFigure typeOfFigure;
    protected double area;

    public abstract void drawFigure();
}
