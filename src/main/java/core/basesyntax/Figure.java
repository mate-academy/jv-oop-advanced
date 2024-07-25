package core.basesyntax;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final double FORMULA_INDEX = 0.5;
    private String color;

    public Figure() {

    }

    public Figure(String color) {
        this.color = color;
    }

    public double getFormat(double number) {
        BigDecimal bigDecimal = new BigDecimal(number).setScale(2, RoundingMode.HALF_UP);
        double result = bigDecimal.doubleValue();
        return result;
    }

    public String getColor() {
        return color;
    }

}
