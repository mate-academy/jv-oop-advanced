package core.basesyntax.shapes;

public class Square extends Shape implements Drawable {
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
        // Figure: square, area: 12.5 sq. units, side length: 7.1 units, color: yellow
        System.out.println("Figure: " + this.getName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "side length: " + getSide() + " units, "
                + "color: " + this.getColor());
    }
}
