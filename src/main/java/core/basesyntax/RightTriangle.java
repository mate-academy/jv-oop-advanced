package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculable {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = firstLeg;
    }

    @Override
    public double area() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTwriangle, area:" + area() + "sq. units, firstLeg: "
                + firstLeg + "secondLeg: " + secondLeg
                + " color: " + getColor());
    }
}
