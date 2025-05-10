package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (firstLeg + secondLeg) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + calculateArea()
                + ", first Leg: " + firstLeg + ", second Leg: " + secondLeg + ", height: "
                + height + ", color: " + color);
    }
}
