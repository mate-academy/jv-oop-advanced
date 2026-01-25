package core.basesyntax;

public abstract class Figure {
    protected Color color;
    protected String [] parameters;
    protected int[] values;
    protected String name;

    public Figure(Color color) {
        this.color = color;
    }

    public Figure(Color color, int value) {
        this(color);
        values = new int[] {value};
    }

    public Figure(Color color, int value1, int value2) {
        this(color);
        values = new int[] {value1, value2};
    }

    public String getColor() {
        return color.name().toLowerCase();
    }

    public String draw() {
        return String.format("Figure: %s, area: %.1f sq. units, %s, color: %s",
                getName(), getArea(), valuesFormat(), getColor());
    }

    protected String getName() {
        return name;
    };

    protected abstract double getArea();

    protected abstract String valuesFormat();
}
