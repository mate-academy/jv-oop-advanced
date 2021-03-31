package core.basesyntax;

public abstract class Figure extends ColorSupplier implements DrawFigure, GetArea {
    protected String color;
    protected String name;

    Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: figure");
    }

    @Override
    public double getArea() {
        return 0;
    }
}
