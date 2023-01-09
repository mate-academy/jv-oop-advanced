package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int size) {
        this.side = size;
    }

    public int getSize() {
        return side;
    }

    public void setSize(int size) {
        this.side = size;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        System.out.println(
                sb.append("Figure: square, area: ")
                        .append(getArea())
                        .append(" sq.units, side: ")
                        .append(side)
                        .append(" units, color: ")
                        .append(getColor()));
    }
}
