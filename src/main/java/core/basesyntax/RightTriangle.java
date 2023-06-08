package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double DEFAUL_NUM = 0.5;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return DEFAUL_NUM * firstLeg * secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " , firstLeg: " + firstLeg
                + " , secondLeg: " + secondLeg + " , color: " + getColor());

    }
}
