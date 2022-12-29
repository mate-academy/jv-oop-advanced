package core.basesyntax;

public abstract class Figure implements IFigure {
    private Colors color;
    private String name;

    Figure(String name, Colors color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public String getFigureInfo() {
        return String.format("Figure: %s, color = %s, area: %.1f sq.units",
                name.toLowerCase(), color.toString().toLowerCase(), getArea());
    }

    @Override
    public String toString() {
        return getFigureInfo();
    }
}
