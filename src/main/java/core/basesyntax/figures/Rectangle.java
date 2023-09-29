package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final int thirdSide;

    public Rectangle(String color, int firstSide, int secondSide, int thirdSide) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.area = firstSide * secondSide * thirdSide;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Rectangle, area: " + area
                + " sq.units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, thirdSide: " + thirdSide
                + " units, color: " + color);
    }
}
