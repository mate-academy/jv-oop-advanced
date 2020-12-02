package core.basesyntax;

public abstract class Figure {

    private Color color;
    private int area;
    private String name;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract String getName();

    public abstract void unicMetod();
}
