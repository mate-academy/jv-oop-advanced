package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid: color="
                + getColor()
                + ", base1="
                + base1
                + ", base2="
                + base2
                + ", height="
                + height
                + ", area="
                + getArea());
    }
}
