package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        this.setColor(color);
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: isoscelesTrapezoid, area: " + area()
                + " sq.units, firstSide: " + getFirstSide()
                + ", firstSide: " + getSecondSide()
                + ", height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return (0.5 * (firstSide + secondSide)) * height;
    }
}
