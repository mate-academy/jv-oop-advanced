package core.basesyntax;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle; color : " + getColor() + "; length: " + length
                + "; width: " + width + "; area: " + getArea() + ";");
    }
}
