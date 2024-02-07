package core.basesyntax;

public class Rectangle extends Figure {
    private final int weight;
    private final int height;

    public Rectangle(String color, int weight, int height) {
        super(color);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String name() {
        return String.valueOf(Figures.RECTANGLE);
    }

    @Override
    public double getArea() {
        return height * weight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name() + ", area: " + getArea()
                + " sq.units, weight: " + this.weight
                + " units, height: " + this.height
                + " units, color: " + getColor());
    }
}
