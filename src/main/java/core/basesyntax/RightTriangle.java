package core.basesyntax;

public class RightTriangle extends Shape {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color,int firstLeg,int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int figureArea() {
        return firstLeg * firstLeg + secondLeg * secondLeg;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + figureArea()
                + " sq. units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + color);
    }
}
