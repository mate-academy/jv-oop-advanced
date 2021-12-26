package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract String draw();

    public final String getColor() {
        return color;
    }

    public final String formatDouble(double value, int dec) {
        if (dec >= 0) {
            return String.format("%." + dec + "f", value);
        } else {
            return String.format("%.0f", value);
        }
    }

    public final String formatDouble(double value) {
        return formatDouble(value, 0);
    }
}
