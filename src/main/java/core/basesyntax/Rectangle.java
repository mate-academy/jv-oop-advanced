package core.basesyntax;

public class Rectangle extends Figure {
    private int weight;
    private int height;
    private String color;

    public Rectangle(int weight, int height, String color) {
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    @Override
    public void getDraw() {
    }

    @Override
    public double getArea() {
        return weight * height;
    }
}
