package core.basesyntax;

public abstract class Figure {
    Color color;

    public Color getColor() {
        return this.color;
    }

    public double getArea() {
        return 0;
    }

    public void draw() {
        System.out.println(getColor().toString().toLowerCase());
    }
}
