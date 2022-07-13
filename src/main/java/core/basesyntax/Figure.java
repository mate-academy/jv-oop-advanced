package core.basesyntax;

public abstract class Figure implements DrawFigure, AreaFigure {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getAreaFigure() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
