package core.basesyntax;

public class Square extends Rectangle {
    public Square(Color color, double side) {
        super(color, side, side);
    }

    @Override
    public double area() {
        return getSideA() * getSideA();
    }

    public String draw() {
        return "Figure: " + FigureName.SQUARE.name() + " area: " + area()
                + " side: " + getSideA() + " color: " + getColor().name();
    }
}
