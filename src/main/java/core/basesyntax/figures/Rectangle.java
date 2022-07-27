package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width) {
        super(color);
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn.");
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
