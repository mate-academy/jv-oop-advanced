package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double AREA_COEFFICIENT = 0.5;
    private double smallBase;
    private double bigBase;
    private double height;
    private double leg;

    public IsoscelesTrapezoid(String colour, double smallBase, double bigBase, double height) {
        super(colour);
        setHeight(height);
        setSmallBase(smallBase);
        setBigBase(bigBase);
        setLeg();
    }

    public void setSmallBase(double smallBase) {
        this.smallBase = roundValues(smallBase);
    }

    public void setBigBase(double bigBase) {
        this.bigBase = roundValues(bigBase);
    }

    public void setHeight(double height) {
        this.height = roundValues(height);
    }

    public void setLeg() {
        this.leg = roundValues(countLeg());
    }

    private double countLeg() {
        return roundValues(Math.hypot((bigBase - smallBase) * AREA_COEFFICIENT, height));
    }

    @Override
    public double calculateArea() {
        return roundValues(smallBase * bigBase * AREA_COEFFICIENT * height);
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
