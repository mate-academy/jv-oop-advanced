package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    private String getFigureName() {
        String figureFullName = this.getClass().getName();
        int lastIdx = figureFullName.lastIndexOf('.');
        return figureFullName.substring(lastIdx + 1);
    }

    @Override
    public String draw() {
        return "Drowing a " + getFigureName();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureName() + ", area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + getColor();
    }
}
