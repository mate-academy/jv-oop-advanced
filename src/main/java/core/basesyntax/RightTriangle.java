package core.basesyntax;

public class RightTriangle extends Figure implements AreaDrawable {
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
    public void drawTheFigure() {
        System.out.println("Figure: right rectangle, firstLeg = " + firstLeg
                + ", secondLeg = " + secondLeg + ", area = " + getArea()
                + ", color: " + getRandomColor());
    }
}
