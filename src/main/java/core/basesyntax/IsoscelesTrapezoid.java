package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    int base1;
    int base2;
    int height;
    String color;

    public IsoscelesTrapezoid(int base1, int base2, int height, String color) {
        this.color = color;
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
        System.out.println("IsoscelesTrapezoid, area: " + getArea() + " sq. units, color: " + color + ", base1: " + base1
                + " units, base2: " + base2 + " units, height: " + height + " units");
    }
}
