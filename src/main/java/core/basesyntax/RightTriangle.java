package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double AREA_COEFFICIENT = 0.5;
    private final double firstLeg;
    private final double secondLeg;
    private final double hypotenuse;

    public RightTriangle(String colour, double firstLeg, double secondLeg) {
        super(colour);
        this.firstLeg = super.roundValues(firstLeg);
        this.secondLeg = super.roundValues(secondLeg);
        this.hypotenuse = countHypotenuse();
    }

    private double countHypotenuse() {
        return super.roundValues(Math.hypot(this.firstLeg, this.secondLeg));
    }

    @Override
    public double calculateArea() {
        return super.roundValues((firstLeg * secondLeg) * AREA_COEFFICIENT);
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
