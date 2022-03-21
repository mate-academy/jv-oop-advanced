package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int numberElementsArray = 6;
        Figure [] figures = new Figure[numberElementsArray];

        for (int i = 0; i < numberElementsArray; i++) {
            if (i < numberElementsArray / 2) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            System.out.println(figure);
        }
    }
}
