package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double AREA_COEFFICIENT = 0.5;
    private final double smallBase;
    private final double bigBase;
    private final double height;
    private final double leg;

    public IsoscelesTrapezoid(String colour, double smallBase, double bigBase, double height) {
        super(colour);
        this.smallBase = super.roundValues(smallBase);
        this.bigBase = super.roundValues(bigBase);
        this.height = super.roundValues(height);
        this.leg = countLeg();
    }

    private double countLeg() {
        return super.roundValues(Math.hypot((bigBase - smallBase) * AREA_COEFFICIENT, height));
    }

    @Override
    public double calculateArea() {
        return super.roundValues(smallBase * bigBase * AREA_COEFFICIENT * height);
    }

    @Override
    public void draw() {
        String output = this.getColour() + " "
                + this.getClass().getSimpleName() + "Has a bigger base is :"
                + this.bigBase + "\nThe smaller is :" + this.smallBase
                + "\nIt's leg is :" + this.leg + "\nIt's height is :" + this.height
                + " units \nAnd it's area is :" + calculateArea()
                + " square units \n";
        System.out.println(output);
    }
}
