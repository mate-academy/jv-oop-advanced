package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    public String color;

    public Figure (String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Unknown basic figure");
    }

    @Override
    public double getArea() {
        return 0;
    }
}
