package core.basesyntax;

public class Rectangle extends Figure implements AreaFigure {
    private int height;
    private int width;

    public Rectangle(int height, int width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.print("Figure: ");
        System.out.print("Rectangle, ");
        System.out.print(" Height - " + height);
        System.out.print(", Wigth - " + width);
        System.out.print(", Area - " + (height * width));
        System.out.print(", Color: " + getColor().toLowerCase() + "\n");
    }
}

