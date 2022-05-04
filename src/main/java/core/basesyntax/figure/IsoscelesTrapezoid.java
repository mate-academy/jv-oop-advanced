package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstSide * secondSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("----------------------------"
                + "\n" + "Figure: isosceles trapezoid"
                + "\n" + "Area: " + getArea() + " sq.units"
                + "\n" + "Side A: " + firstSide + " units"
                + "\n" + "Side B: " + secondSide + " units"
                + "\n" + "Height: " + height + " units"
                + "\n" + "Color: " + getColor()
                + "\n" + "----------------------------" + "\n");
    }
}
