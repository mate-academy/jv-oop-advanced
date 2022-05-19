package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawable{
    final private double firstLeg;
    final private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    @Override
    public double calculateArea() {
        return (firstLeg / secondLeg) * 2;
    }

    @Override
    public void draw() {
        System.out.println("color = " + getColor() + " firstLeg = " + firstLeg + " secondLeg = " + secondLeg);
    }
}
