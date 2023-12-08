package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        //widening casting eliminates precision loss in the return statement?
        return (double) (firstLeg * secondLeg) * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle: Color: " + getColor() + ", Legs A-B: "
                + firstLeg + " " + secondLeg
                + ", Area: " + calculateArea() + "\n");
    }
}
