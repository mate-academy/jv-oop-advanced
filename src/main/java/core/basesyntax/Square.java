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
    public double ObtainArea() {
        return side * side;
    }

    @Override
    public void DrawArea() {
        System.out.println("Figure: square, area: " + ObtainArea() + " sq. units, side: "
                + side + " units, color: " + color);
    }
}


