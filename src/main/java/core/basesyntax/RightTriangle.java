package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setHypotenuse();
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse() {
        this.hypotenuse = Math.sqrt((firstLeg * firstLeg) + (secondLeg * secondLeg));
    }

    @Override
    public double areaCalculation() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle"
                + ", firstLeg = "
                + firstLeg
                + " units"
                + ", secondLeg = "
                + secondLeg
                + " units"
                + ", hypotenuse = "
                + hypotenuse
                + " units"
                + ", area = "
                + areaCalculation()
                + " units"
                + ", color = "
                + getColor()
        );
    }
}
