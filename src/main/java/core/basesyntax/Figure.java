package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getFigureNameMessage() {
        return "Figure: " + getClass().getSimpleName().toLowerCase() + ", ";
    }

    public String getFigureAreaMessage() {
        return "area: " + calculateArea() + " sq. units, ";
    }

    public String getFigureColorMessage() {
        return "color: " + getColor();
    }
}
