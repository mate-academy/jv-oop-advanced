package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int weight;

    public Rectangle(String color, int height, int weight) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double calculateArea() {
        return height * weight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq. units, height: "
                + height + " units, weight " + weight + " units, color: " + getColor());
    }
}
