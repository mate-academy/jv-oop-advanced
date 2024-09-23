package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstLeg;
    private double secondLeg;

    public IsoscelesTrapezoid(String color, double height, double firstLeg, double secondLeg) {
        super(color);
        this.height = height;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return ((firstLeg + secondLeg) / 2) * height;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculateArea() + " sq. units, height: "
                + height + " units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + getColor());
    }
}
