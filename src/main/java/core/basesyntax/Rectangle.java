package core.basesyntax;

public class Rectangle extends Figure implements Behaviour {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with color: " + getColor() + ", width: " + width + " and height: " + height);
    }
}
