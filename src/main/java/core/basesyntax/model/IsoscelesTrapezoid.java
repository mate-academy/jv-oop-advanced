package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int height;
    private int side;

    public IsoscelesTrapezoid(int base, int height, int side, String color) {
        super(color);
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return 0.5 * (base + side) * height;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid: "
                + "color: " + getColor()
                + ", base: " + getBase() + " units"
                + ", height: " + getHeight() + " units"
                + ", side: " + getSide() + " units"
                + ", area: " + getArea() + " sq. units");
    }
}
