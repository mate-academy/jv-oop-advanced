package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int numberElementsArray = 6;
        Figure [] figureArray = new Figure[numberElementsArray];

        for (int i = 0; i < numberElementsArray; i++) {
            if (i < numberElementsArray / 2) {
                figureArray[i] = new FigureSupplier().getRandomFigure();
            } else {
                figureArray[i] = new FigureSupplier().getDefaultFigure();
            }
        }

        for (Figure a: figureArray) {
            System.out.println(a);
        }
    }
}
