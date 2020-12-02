package core.basesyntax;

public abstract class Figure {

    protected double area;
    protected Color color;

    public Color getColor() {
        return color;
    }

    public void draw() {
        System.out.println("Figure is printed");
    }
}

