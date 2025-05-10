package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final int base1;
    private final int base2;
    private final int height;

    public IsoscelesTrapezoid(String color, int base1, int base2, int height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    void draw() {
        System.out.println("Figure: IsoscelesTrapezoid");
        System.out.println("Color: " + getColor());
        System.out.println("Base 1: " + base1);
        System.out.println("Base 2: " + base2);
        System.out.println("height: " + height);
    }
}
