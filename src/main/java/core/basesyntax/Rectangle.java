package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setColor(color);
    }

    @Override
    public int area() {
        return (int) firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Figure: rectangle, " +
                "firstSide: " + firstSide + " units " +
                ", secondSide: " + secondSide + " units " +
                ", color: " + getColor() +
                ", area: " + area() + " sq. units";
    }
}
