package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int height,
                              String color, String name) {
        super(color, name);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.firstBase + this.secondBase) / (double) 2
                * Math.sqrt((this.height * this.height)
                - ((this.secondBase - this.firstBase) * (this.secondBase - this.firstBase))
                / (double) 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " sq. units, firstBase length: " + getFirstBase()
                + " units, secondBase length: " + getSecondBase()
                + " units, height length: " + getHeight()
                + " units, color: " + getColor());
    }
}
