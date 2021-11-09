package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase,
                              double height, String name, String color) {
        super(name, color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " sq. units, firstBase: " + firstBase
                + " units, secondBase: " + secondBase + " units, height: "
                + height + " units, color: " + getColor());
    }
}
