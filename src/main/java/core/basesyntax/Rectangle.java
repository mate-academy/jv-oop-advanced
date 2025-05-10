package core.basesyntax;

public class Rectangle extends Figure {
    private int weight;
    private int height;

    public Rectangle(String color, int weight, int height) {
        super(color);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double getArea() {
        return weight * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " units, height: " + this.height + " units, width: "
                + this.weight + " units, color: " + getColor());
    }
}
