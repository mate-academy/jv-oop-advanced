package core.basesyntax;

// there are some figures
public abstract class Figure implements AreaCalculator, FigurePainter {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
