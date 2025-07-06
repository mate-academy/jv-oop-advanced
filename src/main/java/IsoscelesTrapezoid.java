public class IsoscelesTrapezoid implements Figure {
    private final double base1;
    private final double base2;
    private final double height;
    private final String color;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() +
                " sq. units, base1: " + base1 + " units, base2: " + base2 + " units, height: " + height + " units, color: " + color);
    }
}

