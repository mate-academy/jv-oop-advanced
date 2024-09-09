package base;

public class Figure implements AreaCalculable, Drawable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.println("Figure color: " + color);
    }
}
