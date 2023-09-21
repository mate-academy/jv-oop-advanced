package core.basesyntax;

import java.text.DecimalFormat;

public class Figure implements AreaCalculator {
    protected final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void getArea() {

    }
}
