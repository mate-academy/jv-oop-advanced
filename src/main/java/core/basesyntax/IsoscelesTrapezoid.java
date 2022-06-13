package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstLeg;
    private int secondLeg;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int height, Color color) {
        super(color);
        this.setFirstLeg();
        this.setSecondLeg();
        this.setHeight();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg() {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg() {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (getFirstLeg() + getSecondLeg()) / 2 * getHeight();
    }

    @Override
    public void draw() {
        System.out.println(" Figure: IsoscelesTrapezoid, area: " + getArea()
                + "sq.units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, height: " + getHeight()
                + " color: " + getColor());
    }
}
