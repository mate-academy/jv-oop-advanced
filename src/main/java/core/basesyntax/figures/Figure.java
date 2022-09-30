package core.basesyntax.figures;

import core.basesyntax.suppliers.Color;

public abstract class Figure implements AreaCalculator, Printable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    String getFormatted(double d) {
        return String.format("%.2f", d);
    }
}
