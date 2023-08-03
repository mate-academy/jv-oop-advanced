package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(int base1, int base2, int height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) * height) / 2.0;
    }

    @Override
    public void draw() {
        System.out.print("Figure: ");
        System.out.print("IsoscelesTrapezoid, ");
        System.out.print(" Base1 - " + base1);
        System.out.print(", Base2 - " + base2);
        System.out.print(", Height - " + height);
        System.out.print(", Area - " + getArea());
        System.out.print(", Color: " + getColor().toLowerCase() + "\n");
    }
}
