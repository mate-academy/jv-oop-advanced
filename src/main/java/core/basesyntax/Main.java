package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {FigureSupplier.getDefaultFigure(),
                FigureSupplier.getDefaultFigure(),
                FigureSupplier.getDefaultFigure(),
                new Rectangle(Color.BLUE, 9, 12),
                new RightTriangle(Color.GREEN, 7, 5),
                new IsoscelesTrapezoid(Color.RED, 4, 6, 3)};

        for (int i = 0; i < 3; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }
        for (Figure f : figures) {
            f.draw();
        }
    }
}
