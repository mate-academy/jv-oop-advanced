package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    int base1;
    int base2;
    int height;

    public IsoscelesTrapezoid(int base1, int base2, int height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid, area: " + getArea() + ", color: " + color + ", base1: " + base1
                + ", base2: " + base2 + ", height: " + height);
    }
}
