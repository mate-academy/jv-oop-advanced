package core.basesyntax;

public abstract class Figure implements AreaCalculator, InfoImplementer {
    private String color = new ColorSupplier().getRandomColor();

    private String name;

    private float something = new FigureSupplier().getRandomFigure();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public float getArea() {
        return 0;
    }

    @Override
    public StringBuilder printInfo() {
        return null;
    }

    public float getSomething() {
        return something;
    }
}
