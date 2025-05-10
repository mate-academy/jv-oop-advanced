package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double side;
    private double height;

    public IsoscelesTrapezoid(Color color, double base1, double base2,
                              double side, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.side = side;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + " base1: " + base1
                + " base 2: " + base2
                + " side: " + side
                + " height: " + height
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }
}
