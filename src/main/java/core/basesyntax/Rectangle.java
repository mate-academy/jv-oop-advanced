package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.setName("rectangle");
        super.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName()
                + ", area: " + this.getArea() + " sq.units"
                + ", firstSide: " + firstSide + " units"
                + ", secondSide: " + secondSide + " units"
                + ", color: " + this.getColor());
    }

    public double getArea() {
        return firstSide * secondSide;
    }
}
