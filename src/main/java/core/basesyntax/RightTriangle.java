package core.basesyntax;

public class RightTriangle extends Figure {
    public static final int DIVIDER_TWO = 2;
    private int firstLeg;

    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void getArea() {
        double area = (double) (firstLeg * secondLeg) / DIVIDER_TWO;
        System.out.println("Figure: right triangle, area: " + area + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor().toLowerCase());
    }
}
