package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);
        int numberOfFigures = 6;

        Figure[] figures = new Figure[numberOfFigures];
        for (int i = 0; i < numberOfFigures; i++) {
            if (i < numberOfFigures / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].getInformation());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].getInformation());
            }
        }
    }
}
