package core.basesyntax;

public abstract class Figure {
    protected Color color;
    protected int unit;
    protected String name;

    public Figure(Color color) {
        this.color = color;
    }

    public Figure(Color color, int unit) {
        this.color = color;
        this.unit = unit;
    }

    public String getColor() {
        return color.name().toLowerCase();
    }

    public String draw() {
        return String.format("Figure: %s, area: %.1f sq. units, %s, color: %s",
                getName(), getArea(), getSpecificParams(), getColor());
    }

    protected String getName() {
        return name;
    };

    protected abstract double getArea();

    protected abstract String getSpecificParams();
}
