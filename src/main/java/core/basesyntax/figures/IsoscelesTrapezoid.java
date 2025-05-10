package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double equalSides;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(String color,
                              double firstBase,
                              double secondBase,
                              double equalSides) {
        super(color);
        this.equalSides = equalSides;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * 0.5
                * Math.sqrt(equalSides * equalSides
                - Math.pow((firstBase - secondBase), 2) * 0.25);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid,\n area: " + getArea()
                + "\nfirst base: " + firstBase
                + "\nsecond base: " + secondBase
                + "\nequal sides: " + equalSides
                + "\ncolor: " + color);
    }
}
