package core.basesyntax;

public abstract class GeometryFigure {
    private String color;

    public GeometryFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
