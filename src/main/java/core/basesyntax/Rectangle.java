package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int weight;
    private double diagonal;

    public Rectangle(String color, int weight, int height) {
        super(color);
        this.weight = weight;
        this.height = height;
        draw();
    }

    @Override
    public void draw() {
        area = height * weight;
        diagonal = Math.sqrt(height * height + weight * weight);
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + area + " sq. units, diagonal: " +
                diagonal + ", height: " + height + ", weight: " + weight + ", color: " + color;
    }
}
