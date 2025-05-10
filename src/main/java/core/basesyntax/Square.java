package core.basesyntax;

public class Square extends Figure implements Drawer {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: RightTriangle, area: ")
                        .append(this.getArea())
                        .append(" sq.units, side: ")
                        .append(side)
                        .append(" units, color: ")
                        .append(this.getColour())
        );
    }
}
