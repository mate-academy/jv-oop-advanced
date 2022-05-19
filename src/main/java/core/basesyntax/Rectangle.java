package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void drawInfo() {
        System.out.println("Rectangle. First side: " + firstSide + ". Second side: "
                + secondSide + ". Area: " + getArea() + ". Color: " + getColor());
    }
}
