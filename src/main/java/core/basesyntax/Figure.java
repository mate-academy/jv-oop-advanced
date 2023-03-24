package core.basesyntax;

public abstract class Figure implements FigureArea {
    protected String color;
    protected double area;
    protected String data;

    public void getColor() {
        color = ColorSupplier.getRandomColor();
    }

    public abstract String getData();
}
