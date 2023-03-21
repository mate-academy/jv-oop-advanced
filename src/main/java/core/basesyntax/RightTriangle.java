package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        String message = "Figure: RightTriagle, area: " + getArea()
                + " firstLeg:" + firstLeg + " secondLeg" + secondLeg
                + " color:" + getColor();
        System.out.println(message);
    }
}
