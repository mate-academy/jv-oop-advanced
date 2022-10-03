package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresClass = new Figure[]{figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(), figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(), figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure()};
        for (Figure figuresClass1: figuresClass) {
            figuresClass1.draw();
        }
    }
}
