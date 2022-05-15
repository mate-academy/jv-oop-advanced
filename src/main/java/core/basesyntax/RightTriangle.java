package core.basesyntax;

public class RightTriangle extends Figure{
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg){
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void drawFigure() {
        System.out.println("Right Triangle: first leg = " + firstLeg + ", second leg = " + secondLeg + ", area = "
                + getArea() + ", color - " + getColor());
    }
}
