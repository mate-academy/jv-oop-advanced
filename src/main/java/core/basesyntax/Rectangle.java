package core.basesyntax;

public class Rectangle extends Figure {

    private double firstLeg;
    private double secondLeg;
    private double thirdLeg;

    public Rectangle(String color, double firstLeg, double secondLeg, double thirdLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getThirdLeg() {
        return thirdLeg;
    }

    public void setThirdLeg(double thirdLeg) {
        this.thirdLeg = thirdLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle\nColor: " + getColor() + "\nArea: " + getArea()
                + "\nFirst leg: " + thirdLeg + "\nSecond leg: " + secondLeg + "\nThird leg: " + thirdLeg);
    }

    @Override
    public double getArea() {
        double semiPerimeter = (firstLeg + secondLeg + thirdLeg) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstLeg) * (semiPerimeter - secondLeg)
                * (semiPerimeter - thirdLeg));
    }
}
