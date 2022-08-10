package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier randomFigureGenerator = new FigureSupplier();
        Figure randomFigure;
        Figure[] result = new Figure[10];

        for (int i = 0; i < result.length; i++) {
            if (i < result.length / 2) {
                randomFigure = randomFigureGenerator.getRandomFigure();
            } else {
                randomFigure = randomFigureGenerator.getDefaultFigure();
            }
            result[i] = randomFigure;
            randomFigure.printState();
        }
    }
}
