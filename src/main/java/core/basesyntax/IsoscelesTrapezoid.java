package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(double height, double firstBase, double secondBase, String color) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((firstBase + secondBase) * height) / 2;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: isosceles trapezoid, area: ";
        String secondPart = calculateArea() + " sq. units, first base: ";
        String thirdPart = firstBase + " units, second base: " + secondBase + " units, height: ";
        String fourthPart = height + " units, color: " + getColor();
        System.out.println(firstPart + secondPart + thirdPart + fourthPart);
    }
}
