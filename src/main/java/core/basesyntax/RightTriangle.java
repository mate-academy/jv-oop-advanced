package core.basesyntax;

public class RightTriangle extends Figure {

    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(String.format("First leg: %s. Second leg: %s",
                firstLeg, secondLeg));
    }
}
