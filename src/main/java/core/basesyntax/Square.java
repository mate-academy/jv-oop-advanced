package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(Colors randomColor, int side) {
        this.color = randomColor;
        this.side = side;
    }

    @Override
    public int areaCalculator() {
        return this.side * this.side;
    }

    @Override
    public void informationCalculator() {
        String squareInformation = String.valueOf(new StringBuilder()
                .append("Figure: square, area: ")
                .append(areaCalculator())
                .append(" sq.units, side: ")
                .append(this.side)
                .append(" units, color: ")
                .append(color));
        System.out.println(squareInformation);
    }

}
