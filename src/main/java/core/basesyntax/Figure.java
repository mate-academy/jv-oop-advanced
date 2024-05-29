package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {

    protected Color color;

    protected double area;

    public Figure() {

    }

    public Figure(Color color) {
        this.color = color;
    }

}
