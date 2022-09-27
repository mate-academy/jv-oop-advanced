package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure [] randomFigures = {fs.getRandomFigure(),
                fs.getRandomFigure(), fs.getRandomFigure()};
        Figure [] defaultFigures = {fs.getDefaultFigure(),
                fs.getDefaultFigure(), fs.getDefaultFigure()};

        for (Figure figure: randomFigures) {
            System.out.println(figure);
        }

        System.out.println();

        for (Figure figure: defaultFigures) {
            System.out.println(figure);
        }
    }
}
