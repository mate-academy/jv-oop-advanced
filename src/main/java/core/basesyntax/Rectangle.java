package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + this.getArea()
                + " sq. units, width: "
                + this.width + " units, height: " + this.height + " units, color: "
                + this.getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}
