package core.basesyntax;

public class Square extends Figure {
    private int squareSide;

    public Square(String name, String color, int squareSide) {
        super(name, color);
        this.squareSide = squareSide;
    }

    public int getSquareSide() {
        return squareSide;
    }

    @Override
    public double countArea() {
        return squareSide * squareSide;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + countArea()
                + ", side: " + squareSide);
    }
}
