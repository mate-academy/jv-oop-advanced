package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, Areable {

    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
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

    @Override
    public void draw() {
        System.out.println("Figure: Right rectangle\nColor: " + getColor()
                + "\nFirst leg: " + firstLeg + "\nSecond leg: " + secondLeg);
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
