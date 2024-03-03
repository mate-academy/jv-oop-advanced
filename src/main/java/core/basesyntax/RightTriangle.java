package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private String color;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        double area = firstLeg * secondLeg / 2;
        this.setArea(area);
        return area;
    }

    @Override
    public void paintFigure() {
        System.out.println("Figure : RightTriangle, area : " + getArea() + ", firstLeg : "
                + firstLeg + ", secondLeg  : " + secondLeg + ", color : " + color);
    }
}
