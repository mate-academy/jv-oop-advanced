package core.basesyntax;

public abstract class Figure implements Drawable {

    protected double area;
    protected Color color;

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public void draw() {
        System.out.println("Figure is printed");
    }
}

