package core.basesyntax;

public class RightTriangle extends Figure{
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {

    }

    @Override
    public double area() {
        return (double) (firstLeg*secondLeg)/2;
    }
}
