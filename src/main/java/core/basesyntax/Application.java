package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figuresList = {figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure()
        };

        for (Figure figure : figuresList) {
            figure.draw();
        }
    }
}
