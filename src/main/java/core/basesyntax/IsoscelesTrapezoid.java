package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(double base1, double bas2, double height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getArea() {
        return (base1 + base2) * height / 2;
    }

    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq. units, base1: " + base1 + " base2: " + base2
                + " height: " + height + " color; " + color);

    }

}
