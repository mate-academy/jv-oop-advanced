package core.basesyntax;

public class Triangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double thirdLeg;

    public Triangle(String color, double firstLeg, double secondLeg, double thirdLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
    }

    public Triangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle\nColor: " + getColor() + "\nArea: " + getArea()
                + "\nFirst leg: " + thirdLeg + "\nSecond leg: " + secondLeg
                + "\nThird leg: " + thirdLeg);
    }

    @Override
    public double getArea() {
        double semiPerimeter = (firstLeg + secondLeg + thirdLeg) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstLeg) * (semiPerimeter - secondLeg)
                * (semiPerimeter - thirdLeg));
    }
}
