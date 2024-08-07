package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return (double) Math.round((firstSide * secondSide) * 10) / 10;
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
