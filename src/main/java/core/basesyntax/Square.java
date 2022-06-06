package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: Square, area: ")
                        .append(this.getArea())
                        .append(" sq.units, side: ")
                        .append(side)
                        .append(" units, color: ")
                        .append(this.getColor())
        );
    }
}
