package core.basesyntax;

import java.text.DecimalFormat;

public abstract class Figure implements Quadrangular, Triangular {
    protected static final String DECIMAL_FORMAT_PATTERN = "#.00";
    protected DecimalFormat decimalFormat = new DecimalFormat(DECIMAL_FORMAT_PATTERN);

    protected String color;
    protected FigureType figureType;
    protected double area;

    public abstract void drawFigure();

    protected void isColor(String color) {
        this.color = color;
    }
}
