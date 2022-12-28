package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure [] figures = new Figure[10];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i <= 4) {
                figureSupplier.getRandomFigure().PrintInfo();
            } else {figureSupplier.getDefaultFigure().PrintInfo();}
        }
    }
}
