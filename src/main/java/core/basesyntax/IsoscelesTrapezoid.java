package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase,
                              int firstLeg, int secondLeg, int height) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
        super.setName("isosceles trapezoid");
        super.setColor(color);
    }

    public int getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName()
                + ", area: " + this.getArea() + " sq.units"
                + ", firstBase: " + firstBase + " units"
                + ", secondBase: " + secondBase + " units"
                + ", firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units"
                + ", height: " + height + " units"
                + ", color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;
    }
}
