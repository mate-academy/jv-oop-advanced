package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int weight;
    private double diagonal;

    public Rectangle(Color color, int weight, int height) {
        super(color);
        this.weight = weight;
        this.height = height;
        calculate();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, diagonal: "
                + diagonal + ", height: " + height
                + ", weight: " + weight + ", color: " + getColor());
    }

    @Override
    public void calculate() {
        setArea(height * weight);
        diagonal = Math.sqrt(height * height + weight * weight);
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public double getDiagonal() {
        return diagonal;
    }
}
