package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units");
    }
}
