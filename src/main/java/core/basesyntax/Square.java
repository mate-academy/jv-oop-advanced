package core.basesyntax;

public class Square extends Figure implements FigureArea {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square(int side, String color) {
        this.side = side;
        super.setColor(color);
    }

    @Override
    public double getFigureArea() {
        return side * side;
    }

    @Override
    public String getFigureInfo() {
        return "square, area: " + getFigureArea() 
            + " sq.units, side: " + side + " units, color: " + super.getColor();
    }
}
