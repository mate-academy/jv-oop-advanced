package core.basesyntax;

public class RightRectangle extends FigureAbstract implements Figure {
    private final int firstLeg;
    private final int secondLeg;


    public RightRectangle(String color, int firstSide, int secondSide) {
        this.color = color;
        this.firstLeg = firstSide;
        this.secondLeg = secondSide;
    }

    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:RightRectangle," +
                "area:" + getArea() +
                " sq.units,firstLeg:" +
                firstLeg + " units,secondLeg:" + secondLeg + " units,color:" + color);
    }
}
