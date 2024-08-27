package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public Figure createRandomFigure() {
        return new Square(getRandomInt());
    }

    @Override
    public void printInformation() {
        System.out.println("Square side: " + side + " area: " + (Math.pow(side, 2))
                + " Color " + getColor());
    }
}
