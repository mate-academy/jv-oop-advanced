package core.basesyntax;

public abstract class Figure {
    public static final String UNITS = "units";
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

    public void draw() {
        System.out.printf(
                "Figure: %s, area: %.1f sq. units, %scolor: %s%n",
                getName(), getArea(), valuesFormat(UNITS), getColor());
    }

    protected String getName() {
        return name;
    }

    protected abstract double getArea();

    protected String valuesFormat(String units) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            sb.append(parameters[i]).append(": ")
                    .append(values[i]).append(" ").append(units)
                    .append(", ");
        }
        return sb.toString();
    }
}
