package core.basesyntax;

import java.text.DecimalFormat;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final double FORMULA_INDEX = 0.5;
    private String color;

    public Figure() {

    }

    public Figure(String color) {
        this.color = color;
    }

    public double getFormat(String pattern, double number) {
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        double result = Double.parseDouble(decimalFormat.format(number));
        return result;
    }

    public String getColor() {
        return color;
    }

}
