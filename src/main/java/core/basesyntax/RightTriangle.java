package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg = 20;
    private int secondLeg = 30;
    private String color = Colors.GREEN.name();

    public double getArea() {
        area = firstLeg * secondLeg / 2;
        return area;
    }

    @Override
    public void paintFigure() {
        System.out.println("Figure : RightTriangle, area : " + getArea() + ", firstLeg : "
                + firstLeg + ", secondLeg  : " + secondLeg + ", color : " + color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }
}
