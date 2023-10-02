package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculation {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Figure() {

    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }

    public void draw() {
    }
}


