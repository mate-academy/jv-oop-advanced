package core.basesyntax;

public abstract class Figure extends FigureSupplier implements CollorSupplier, GetArray {
    private String color;

    public void setColor() {
        this.color = getRandomColor();
    }

    public String getColor() {
        return this.color;
    }

    public abstract double getArea();

    public abstract void draw();

    @Override
    public Figure[] getArray() {
        return GetArray.super.getArray();
    }
}
