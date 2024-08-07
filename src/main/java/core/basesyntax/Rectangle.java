package core.basesyntax;

public class Rectangle extends Figure {
    private static final double NUMBER_TEN = 10.0;
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return (double) Math.round((firstSide * secondSide) * NUMBER_TEN) / NUMBER_TEN;
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
