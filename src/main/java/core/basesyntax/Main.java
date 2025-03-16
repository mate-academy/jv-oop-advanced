package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }

        figures[3] = new Square(5, Colors.BLUE.toString());
        figures[4] = new RightTriangle(7,5, Colors.YELLOW.toString());
        figures[5] = new FigureSupplier().getDefaultFigure();

    }
}
