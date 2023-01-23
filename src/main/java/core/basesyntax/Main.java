package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[]{figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(), figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure()};
        for (Figure figure:
                figuresArray) {
            figure.draw();
        }
    }
}

