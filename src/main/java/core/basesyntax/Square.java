package core.basesyntax;

public class Square extends FigureForOther {
    public Square(String color, int a) {
        super(color, a);
    }

    @Override
    public double calculatorArea() {
        return getFirstSide() * getFirstSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculatorArea()
                + " sq. units, side: " + getFirstSide()
                + " units, color: " + getColor());
    }
}
