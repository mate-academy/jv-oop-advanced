package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double AREA_COEFFICIENT = 0.5;
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public RightTriangle(String colour, double firstLeg, double secondLeg) {
        super(colour);
        setFirstLeg(firstLeg);
        setSecondLeg(secondLeg);
        setHypotenuse();
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = roundValues(firstLeg);
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = roundValues(secondLeg);
    }

    public void setHypotenuse() {
        this.hypotenuse = countHypotenuse();
    }

    private double countHypotenuse() {
        return roundValues(Math.hypot(this.firstLeg, this.secondLeg));
    }

    @Override
    public double calculateArea() {
        return roundValues((firstLeg * secondLeg) * AREA_COEFFICIENT);
    }

    @Override
    public void draw() {
        String output = this.getColour() + " "
                + this.getClass().getSimpleName() + "Has a smaller leg :"
                + this.firstLeg + "\nThe bigger is :" + this.secondLeg
                + "It's hypotenuse is :" + this.hypotenuse
                + " units \nAnd it's area is :" + calculateArea()
                + " square units \n";
        System.out.println(output);
    }
}
