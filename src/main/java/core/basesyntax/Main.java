package core.basesyntax;

public class Main {

    public static final int SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure[] allFigures = new Figure[SIZE];
        Figure[] figures = {new Rectangle(Color.BLUE, 9, 12),
                new RightTriangle(Color.GREEN, 7, 5),
                new IsoscelesTrapezoid(Color.RED, 4, 6, 3)};

        for (int i = 0; i < 3; i++) {
            allFigures[i] = fs.getRandomFigure();
            allFigures[i+3] = figures[i];
        }

        for (Figure f : allFigures) {
            f.draw();
        }
    }
}
