package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area, Draw{
    private float firstBaseSide;
    private  int secondBasSide;
    private int high;

    public float getFirstBaseSide() {
        return firstBaseSide;
    }

    public void setFirstBaseSide(int firstBaseSide) {
        this.firstBaseSide = firstBaseSide;
    }

    public int getSecondBasSide() {
        return secondBasSide;
    }

    public void setSecondBasSide(int secondBasSide) {
        this.secondBasSide = secondBasSide;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public IsoscelesTrapezoid(String color, float firstBaseSide, int secondBasSide, int high) {
        super(color);
        this.firstBaseSide = firstBaseSide;
        this.secondBasSide = secondBasSide;
        this.high = high;

    }

    @Override
    public double getArea() {
        return (firstBaseSide + secondBasSide) / getNumberTwo * high;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + getArea()
                + " sq.units, " + "firstBaseSide: " + firstBaseSide
                + " units, secondBaseSide: " + secondBasSide
                + " units, high: " + high
                + " units, color: " + super.getColor());
    }
}
