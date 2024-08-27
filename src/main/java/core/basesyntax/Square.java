package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateFigureArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void printInformation() {
        System.out.println("Square side: " + side + " area: " + calculateFigureArea()
                + " Color " + getColor());
    }
}
