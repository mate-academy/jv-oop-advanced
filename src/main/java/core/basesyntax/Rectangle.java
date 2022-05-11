package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int weight;

    public Rectangle(String color, int height, int weight) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, "
                + "height: " + height + " units, weight: " + weight + " units, "
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return height * weight;
    }
}
