package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public int areaCalculation() {
        return side * side;
    }

    @Override
    public void ableToDraw() {
        System.out.println("Figure : square, area: "
                + areaCalculation()
                + " sq.units, "
                + "side: "
                + side
                + " units, "
                + "color: "
                + color);
    }
}
