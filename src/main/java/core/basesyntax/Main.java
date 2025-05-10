package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        Figure randomFigure = new FigureSupplier().getRandomFigure();

        for (int i = 0; i < 3; i++) {
            figures[i] = randomFigure;
        }

        figures[3] = new Square(5, Colors.BLUE.name());
        figures[4] = new RightTriangle(7,5, Colors.YELLOW.name());
        figures[5] = new FigureSupplier().getDefaultFigure();
        for (Figure figure : figures) {
            figure.drawArea();
        }
    }
}
