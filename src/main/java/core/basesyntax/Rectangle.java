package core.basesyntax;

public class Rectangle extends Figure{
    private int length;
    private int width;

    public Rectangle(String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {

    }
}
