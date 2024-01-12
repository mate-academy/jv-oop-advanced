package core.basesyntax;

public class Figure implements Drawable, AreaCalculable {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}

