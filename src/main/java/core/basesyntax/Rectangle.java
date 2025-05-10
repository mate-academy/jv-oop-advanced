package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Rectangle(int firstSide, int secondSide, int thirdSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getArea() {
        return Math.sqrt((firstSide + secondSide + thirdSide)
                * (firstSide + secondSide + thirdSide - firstSide)
                * (firstSide + secondSide + thirdSide - secondSide)
                * (firstSide + secondSide + thirdSide - thirdSide));
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, "
                + getArea()
                + " sq. units, firstSide: "
                + firstSide
                + " units, secondSide: "
                + secondSide
                + " units, thirdSide: "
                + thirdSide
                + " units, color: "
                + getColor());
    }
}
