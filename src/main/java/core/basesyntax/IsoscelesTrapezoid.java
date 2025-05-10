package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, 
                              double height, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", calculateArea()) + " sq.units, firstLeg: "
                + String.format("%.2f", firstLeg)
                + ", secondLeg: " + String.format("%.2f", secondLeg) + ", height: "
                + String.format("%.2f", height) + " units, color: " + color);
    }

    @Override
    public double calculateArea() {
        return ((firstLeg + secondLeg) / 2) * height;
    }
}
