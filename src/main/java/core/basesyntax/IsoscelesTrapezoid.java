package core.basesyntax;

public class IsoscelesTrapezoid extends FigureParent {
    private final double base1; // length of the bottom base
    private final double base2; // length of the top base
    private final double leg; // length of the equal non-parallel sides
    private final double height; // vertical distance between the two bases

    public IsoscelesTrapezoid(double base1, double base2, double leg, double height, String color) {
        super(color);
        if (base1 <= 0 || base2 <= 0 || leg <= 0 || height <= 0) {
            throw new IllegalArgumentException("All dimensions must be positive.");
        }

        this.base1 = base1;
        this.base2 = base2;
        this.leg = leg;
        this.height = height;
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getLeg() {
        return leg;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid"
                + ", area: " + findArea() + " sq. units"
                + ", base1: " + base1 + " units"
                + ", base2: " + base2 + " units"
                + ", leg: " + leg + " units"
                + ", height: " + height + " units"
                + ", color: " + getColor());
    }

    @Override
    public double findArea() {
        return roundTo(((base1 + base2) / 2) * height);
    }
}
