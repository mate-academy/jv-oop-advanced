package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, String color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.setColor(color);
    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + obtainTheArea() + ", color: "
                + getColor() + ", first base: " + firstBase + ", second base: "
                + secondBase + ", height: " + height);
    }

    @Override
    public double obtainTheArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }
}
