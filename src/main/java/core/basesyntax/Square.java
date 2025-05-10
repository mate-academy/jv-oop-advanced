package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String randomColor, int side) {
        this.color = randomColor;
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        String squareInformation = String.valueOf(new StringBuilder()
                .append("Figure: square, area: ")
                .append(getArea())
                .append(" sq.units, side: ")
                .append(this.side)
                .append(" units, color: ")
                .append(color));
        System.out.println(squareInformation);
    }
}
