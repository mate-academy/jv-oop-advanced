package core.basesyntax;

import java.text.DecimalFormat;

public abstract class Figure implements AreaCalculator, FigurePrinter {
    protected static final DecimalFormat df = new DecimalFormat("0.00");
    protected String color;

    public Figure(String color) {
        this.color = color;
    }
}
