package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int leg;
    private int height;

    public IsoscelesTrapezoid(String name, String color, int leg, int height) {
        super(name, color);
        this.leg = leg;
        this.height = height;
    }

    @Override
    public double getArea() {
        double height2 = height;
        return (height2 / 2) * leg * 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, leg: "
                + leg + " units, height: "
                + height + " units, color: " + getColor() + ".");
    }
}
