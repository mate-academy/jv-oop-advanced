package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(){
    }

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: " + secondSide + " units, color: " + color);
    }
}
