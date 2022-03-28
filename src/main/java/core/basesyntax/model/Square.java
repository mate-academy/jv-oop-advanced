package core.basesyntax.model;

public class Square extends Figure implements FigureArea {
    public int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public void area() {
        double areaSquare = Math.pow(side, 2);
        System.out.println("Figure: Square, area: " + areaSquare +
                " sq.units, side: " + side + " units, color: " + getColor());
    }
}
