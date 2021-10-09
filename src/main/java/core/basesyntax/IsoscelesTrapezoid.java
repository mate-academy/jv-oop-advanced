package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int height, String color, String name) {
        this.height = height;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
        super.setName(name);
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return height * (((double)firstLeg + (double) secondLeg) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getName()
                + ", area: " + getArea()
                + " sq.units, firstLeg: " + getFirstLeg()
                + ", secondLeg: " + getSecondLeg()
                + ", height: " + getHeight()
                + ", color: " + getColor());
    }
}
