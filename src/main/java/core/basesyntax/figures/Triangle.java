package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class Triangle extends RightTriangle {
    private double thirdLeg;

    public Triangle(Color color, double firstLeg, double secondLeg, double thirdLeg) {
        super(color, firstLeg, secondLeg);
        this.thirdLeg = thirdLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle\nColor: " + getColor() + "\nArea: " + calculateArea()
                + "\nFirst leg: " + super.getFirstLeg() + "\nSecond leg: " + super.getSecondLeg()
                + "\nThird leg: " + thirdLeg);
    }

    @Override
    public double calculateArea() {
        double semiPerimeter = (super.getFirstLeg() + super.getSecondLeg() + thirdLeg) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - super.getFirstLeg())
                * (semiPerimeter - super.getSecondLeg())
                * (semiPerimeter - thirdLeg));
    }
}
