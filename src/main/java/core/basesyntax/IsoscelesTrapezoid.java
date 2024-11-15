package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(Color color, double base1, double base2, double height) {
        super(String.valueOf(color));
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("base1: " + base1 + " units, base2: "
                + base2 + " units, height: " + height + " units");
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }
}
