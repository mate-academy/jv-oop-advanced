package core.basesyntax;

import java.util.Locale;

public abstract class Figure implements Area, Drawable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    protected String formatDouble(double v) {
        return String.format(Locale.ENGLISH, "%.2f", v);
    }
}
