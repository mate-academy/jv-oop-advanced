package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int totalNumberOfFigures = 11;

        Figure [] result = new Figure[totalNumberOfFigures];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < totalNumberOfFigures / 2; i++) {
            result [i] = figureSupplier.getRandomFigure();
            if (result [i] == null) {
                System.out.println("Figure no " + i + "is null");
            } else {
                result[i].draw();
            }
        }

        for (int i = totalNumberOfFigures / 2; i < totalNumberOfFigures; i++) {
            result [i] = figureSupplier.getDefaultFigure();
            if (result [i] == null) {
                System.out.println("Figure no " + i + "is null");
            } else {
                result[i].draw();
            }
        }
    }
}
