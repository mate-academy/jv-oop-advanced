package core.basesyntax;

public class RightTriangle extends Figure implements FigureInterface, DrawFigure {
    private final int sideLength;

    public RightTriangle(String color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double getFigureArea() {
        final int quantity = 3;
        return quantity * sideLength;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Right-Triangle "
                + "\n"
                + "Figure Area: "
                + getFigureArea()
                + "\n"
                + "Side Length: "
                + sideLength
                + "\n"
                + "Color: "
                + getColor()
                + "\n");
    }

    @Override
    public String toString() {
        return "Figure: Right-Triangle "
                + "\n"
                + "Figure Area: "
                + getFigureArea()
                + "\n"
                + "Side Length: "
                + sideLength
                + "\n"
                + "Color: "
                + getColor()
                + "\n";
    }

}
