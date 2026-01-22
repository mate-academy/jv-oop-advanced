package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, String name,
                              double height, double base1, double base2) {
        this.setColor(color);
        this.setName(name);
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, base1: " + base1 + " units, base2: " + base2
                + " units, height: " + height + " units, color: " + getColor());
    }
}
