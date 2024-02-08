package core.basesyntax;

public class Rectangle extends Figure {
    private int weight;
    private int height;

    public Rectangle(int weight, int height, String color) {
        super(color);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void draw() {
    }

    @Override
    public double getArea() {
        return weight * height;
    }
}
