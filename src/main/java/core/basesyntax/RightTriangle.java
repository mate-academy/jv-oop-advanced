package core.basesyntax;

public class RightTriangle extends Figure implements Description, GetArea {
    private int firstLeg;
    private int secondLeg;
    private String name = "Right triangle";

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
    public void getDescription() {
        System.out.println("Name: " + name + " first leg: " + getFirstLeg()
                + " units " + " second leg: " + getSecondLeg() + " units "
                + " area: " + getArea() + " sq. units " + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
