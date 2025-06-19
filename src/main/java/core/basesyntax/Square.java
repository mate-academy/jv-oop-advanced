package core.basesyntax;

public class Square extends Figure {
    int side;

    public Square(int side, String color) {
        this.side = side;
        super.color = color;
    }

    public Square() {
    }

    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: square, area: " + obtainArea() + " sq. units, side: "
                + side + " units, color: " + color);
    }
}


