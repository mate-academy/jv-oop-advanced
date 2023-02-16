package core.basesyntax;


public class IsoscelesTrapezoid extends Figure {
    private final double side1;
    private final double side2;
    private final double height;

    public IsoscelesTrapezoid(Colors color, int length, int width, int height) {
        super(color);
        this.side1 = length;
        this.side2 = width;
        this.height = height;
    }


    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" + "side 1" + side1 + ", side 2" + side2 + ", height=" + height + ", color=" + getColor() + '}';
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid"
                + ", area=" + calculateArea()
                + " sq.units" + "length=" + side1
                + " units" + ", width=" + side2
                + " units" + ", height=" + height
                + " units" + ", color="
                + getColor());
    }

    @Override
    public double calculateArea() {
        return (side1 + side2) / 2 * height;
    }
}
