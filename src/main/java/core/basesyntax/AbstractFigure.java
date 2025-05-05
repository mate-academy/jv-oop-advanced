package core.basesyntax;

public abstract class AbstractFigure {
    private String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "color='" + color + '\'';
    }
}


