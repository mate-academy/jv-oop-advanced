package core.basesyntax;

public class Rectangle extends Figure {
    private static final double NUMBER_FOR_ROUND = 10.0;
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return (double) Math.round((firstSide * secondSide) * NUMBER_FOR_ROUND) / NUMBER_FOR_ROUND;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.calculateArea()
                + " sq. units, first side: "
                + this.firstSide
                + " units, second side: "
                + this.secondSide
                + " units, color : "
                + super.getColor());
    }
}
