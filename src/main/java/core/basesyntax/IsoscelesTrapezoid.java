package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(String color, double height, double firstBase, double secondBase) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass()
                + ", area: " + this.calculateArea() + " sq. units,"
                + " first base: " + this.firstBase + " units, "
                + " second base: " + this.secondBase + " units, "
                + " height: " + this.height + " units, "
                + "color: " + this.getColor());
    }

    @Override
    public double calculateArea() {
        return ((firstBase * secondBase) * 0.5 * height);
    }

}
