package core.basesyntax;

public class RightTriangle extends Figure implements FigureArea, Draw {

    private  int firstLeg;
    private  int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String getDraw() {
        return null;
    }

    @Override
    public double getArea() {
        return (firstLeg*secondLeg)/2;
    }
}
