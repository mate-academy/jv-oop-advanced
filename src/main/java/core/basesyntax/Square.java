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
        String squareInformation = "Figure: square, area: " + areaCalculator() + " sq.units, side: " + this.side + " units, color: " + color;
        System.out.println(squareInformation);
    }

}
