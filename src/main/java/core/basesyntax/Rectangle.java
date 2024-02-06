package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: rectangle, area: " + area()
                + " sq.units, firstSide: " + getFirstSide()
                + ", secondSide: " + getSecondSide()
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }
}
