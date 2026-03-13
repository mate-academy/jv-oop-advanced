package core.basesyntax;

public class Rectangle extends Figure implements Drawable {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, Color color) {
        super(color, calculateArea(firstSide, secondSide), "Rectangle");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, first side: " + getFirstSide() + " units, second side "
                + getSecondSide() + " units, color: " + getColor());
    }

    private static double calculateArea(int firstSide, int secondSide) {
        return firstSide * secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }
}
