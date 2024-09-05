package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double thirdLeg;
    private double height;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg,
                              double thirdLeg, double height, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstLeg + secondLeg) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure" + ": " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, firstLeg: " + getFirstLeg() + " units, secondLeg: " + getSecondLeg()
                + " units, thirdLeg: " + getThirdLeg() + "units, color: " + getColor());
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public double getThirdLeg() {
        return thirdLeg;
    }
}
