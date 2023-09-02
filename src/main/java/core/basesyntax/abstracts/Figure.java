package core.basesyntax.abstracts;

import core.basesyntax.interfaces.Calculatable;
import core.basesyntax.interfaces.Drawable;

import java.text.DecimalFormat;

public abstract class Figure implements Drawable, Calculatable {
    private String color;
    private final DecimalFormat decimalFormat = new DecimalFormat( "#.#" );


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String setDecimalFormat(double number) {
        return decimalFormat.format(number);
    }
}
