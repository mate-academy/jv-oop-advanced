package core.basesyntax;

public class RightTriangle extends Figure implements Drawnable {
    private int firstLeg, secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    @Override
    public void toDraw() {
        System.out.println("RightTriangle: " + "\n first leg: " + firstLeg + " second leg: "
                + secondLeg + "\n area " + getArea());
    }
    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }
}
