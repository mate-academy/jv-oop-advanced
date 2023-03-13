package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double height, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * (firstLeg + secondLeg) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + area() + " sq.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, height: "
                + height + " units, color: " + getColor());
    }
}

