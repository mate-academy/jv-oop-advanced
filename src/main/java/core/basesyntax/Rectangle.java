package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;
    private String name = "rectangle";

    public Rectangle (String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return this.firstSide * this.secondSide;
    }

    @Override
    public String draw() {
        return "Figure: " + this.name + ", area: " + this.getArea() + " sq.units, first side: " + this.firstSide + " units, second side: " + this.secondSide + " units, color: " + this.color;
    }
}
