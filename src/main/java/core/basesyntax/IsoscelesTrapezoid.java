package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = (secondLeg + firstLeg) / 2 * height;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area:" + calculateArea()
                + "firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg
                + ", height: " + height
                + ", color: " + getColor());
    }
}
