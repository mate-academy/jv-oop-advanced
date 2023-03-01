package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.secondSide = secondSide;
        this.firstSide = firstSide;
    }

    @Override
    public double calculatorArea() {

        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + calculatorArea() + " units, firstSide "
                + firstSide + " units, secondSide " + secondSide + " units, color: " + getColor());
    }
}
