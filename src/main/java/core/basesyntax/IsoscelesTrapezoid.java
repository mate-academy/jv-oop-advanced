package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstLeg + secondLeg) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.2f", getArea())
                + " sq. cm, firstLeg: " + String.format("%.2f", firstLeg) + "cm, secondLeg: "
                + String.format("%.2f", secondLeg) + " cm, height: " + String.format("%.2f", height)
                + "cm, color: " + color);
    }
}
