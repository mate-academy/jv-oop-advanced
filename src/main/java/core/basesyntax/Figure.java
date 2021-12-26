package core.basesyntax;

public abstract class Figure implements AreaCalculator, DrawMethod {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public final String getColor() {
        return color;
    }

    // formatting methods added here, because these used in all subclasses
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
