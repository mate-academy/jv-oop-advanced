package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double weight;

    public Rectangle(String color, double height, double weight) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return height * weight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle" + ", area: "
                + getArea() + "sq.units, height: "
                + height + "units, weight: " + weight
                + weight + "units, color: " + getColor());
    }
}
