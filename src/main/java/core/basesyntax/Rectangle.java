package core.basesyntax;

public class Rectangle extends Figure {

    private double firstSide;
    private double secondSide;

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getcalcutateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getcalcutateArea()
                + " sq.units, firstSide: "
                + firstSide + " units, secondSide: "
                + secondSide + " units, color: "
                + getColor());

    }
}

