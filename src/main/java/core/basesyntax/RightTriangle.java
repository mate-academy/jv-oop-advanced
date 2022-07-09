package core.basesyntax;

public class RightTriangle extends Figure {
    int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + calculateArea() + " sq.units, side: "
                           + side + " units, color: " + color);
    }

    @Override
    public double calculateArea() {
        return side * side * Math.sqrt(3) / 4;
    }
}
