package core.basesyntax;

public class Rectangle extends Figure {

    private int firstSide;
    private int secondSide;

    public Rectangle(String name, String color, int firstSide, int secondSide) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + String.format("%.1f",getArea())
                + " sq.units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, color: " + getColor());
    }

    @Override
    public Double getArea() {
        return (double) (firstSide * secondSide);
    }
}
