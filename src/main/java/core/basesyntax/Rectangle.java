package core.basesyntax;

public class Rectangle extends Figure {
    public double firstSide;
    public double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);

        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void drawArea() {
        double area = this.firstSide * this.secondSide;

        System.out.println("Figure: rectangle, " + "area: " + area + " sq. units, first side: " + this.firstSide + " units, " +
                "second side: " + this.secondSide + " units, color: " + this.color);
    }
}
