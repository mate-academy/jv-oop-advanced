package core.basesyntax;

import java.text.DecimalFormat;

public abstract class Figure implements AreaCalculator {
    private String color;

    private DecimalFormat decimalFormat = new DecimalFormat("#.00");

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DecimalFormat getDecimalFormat() {
        return decimalFormat;
    }

}
