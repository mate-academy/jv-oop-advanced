package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double findArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + FigureName.RIGHTTRIANGLE.name()
                + ", area: "
                + findArea()
                + " sq. units, color: "
                + getColor()
                + ", first leg: "
                + firstLeg
                + ", second leg: "
                + secondLeg);
    }
}
