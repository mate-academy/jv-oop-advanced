package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public RightTriangle(Color color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Double getArea() {
        //widening casting eliminates precision loss in the return statement?
        return (double) (firstLeg * secondLeg) * 0.5 * height;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle:");
    }

    @Override
    public String toString() {
        return ("Color: " + getColor() + ", Legs A-B: " + firstLeg + " " + secondLeg
                + ", Height: " + height + ", Area: " + getArea());
    }
}
