package core.basesyntax;

public class IsoscelesTrapezoid extends BaseFigure implements Behaviour {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(int base1, int base2, int height) {
        super();
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid with color: "
                + getColor() + ", base1: "
                + base1 + " , base2: "
                + base2 + " and height: "
                + height);
    }
}
