package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureIndex = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureIndex.getRandomFigure();
            } else {
                figures[i] = figureIndex.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println(figure.getFigureInfo());
        }
    }
}

