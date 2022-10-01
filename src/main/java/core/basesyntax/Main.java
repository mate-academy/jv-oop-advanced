package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        FiguresClass[] figuresClass = new FiguresClass[]{figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(), figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(), figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure()};
        for (FiguresClass figuresClass1: figuresClass) {
            figuresClass1.draw();
        }
    }
}
