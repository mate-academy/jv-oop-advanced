package base;

public abstract class Figure implements AreaCalculator, Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract void draw();
}
