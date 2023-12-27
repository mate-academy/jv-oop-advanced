package core.basesyntax;

public class Square extends Figure {
    public Square(String color, int a) {
        super(color, a);
    }

    @Override
    public double calculateArea() {
        return getFirstSide() * getFirstSide();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea()
                + " sq. units, side: " + getFirstSide()
                + " units, color: " + getColor());
    }
}
