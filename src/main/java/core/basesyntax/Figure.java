package core.basesyntax;

public abstract class Figure implements AreaCalculator, DrowFigure {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getDrow() {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
