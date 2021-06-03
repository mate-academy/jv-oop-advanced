package core.basesyntax.shapes;

public class Square extends Shape {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "side length: " + getSide() + " units, "
                + "color: " + this.getColor());
    }
}
