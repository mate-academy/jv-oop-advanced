package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private static final String MEASURE_UNIT = "unit";
    private final String color;
    private final String measureUnit;

    public Figure(String color) {
        this.color = color;
        this.measureUnit = MEASURE_UNIT;
    }

    public String getMeasureUnit(double value) {
        return value == 1 ? measureUnit : measureUnit + "s";
    }

    public String getColor() {
        return color;
    }
}
