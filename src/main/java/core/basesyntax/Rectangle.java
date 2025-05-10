package core.basesyntax;

public class Rectangle extends Figure {
    private int weight;
    private int height;

    public Rectangle(int weight, int height, String id, String color) {
        super(id, color);
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String drawFigure() {
        return "Figure:" + getId()
                + ", Area " + calculateArea()
                + " sq, "
                + "side length " + height
                + ", color " + getColor();

    }

    @Override
    public double calculateArea() {
        return weight * height;
    }
}
