package core.basesyntax;

import java.text.DecimalFormat;

public abstract class Figure implements AreaCalculator, Drawable {
    protected static final String DECIMAL_FORMAT_PATTERN = "#.00";
    protected DecimalFormat decimalFormat = new DecimalFormat(DECIMAL_FORMAT_PATTERN);

    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
