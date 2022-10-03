package core.basesyntax;

public class Square extends Rectangle {
    public Square(double side, Color color) {
        super(side, side, color);
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
