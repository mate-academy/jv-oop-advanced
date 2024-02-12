package core.basesyntax.model;

public abstract class Figure implements AreaCalculator, FigurePainter {
    private String color;
    private double area;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
