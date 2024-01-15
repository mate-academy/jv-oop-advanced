package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Figure: right triangle, area: ")
                .append(dF.format(getArea())).append(" sq.units, side: ")
                .append(side).append(", color: ").append(getColor()));
    }
}
