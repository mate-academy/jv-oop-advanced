package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, "
                + "area: " + getArea() + " sq. units, "
                + "firstSide: " + getFirstSide() + " units, "
                + "secondSide: " + getSecondSide() + " units, "
                + "color: " + getColor());
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }
}
