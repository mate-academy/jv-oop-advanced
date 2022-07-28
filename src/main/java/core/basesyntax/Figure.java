package core.basesyntax;

public class Figure implements Drawable, Area {
    private Colors color;

    public Figure(Colors color) {
        this.color = color;

    }

    public Colors getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
