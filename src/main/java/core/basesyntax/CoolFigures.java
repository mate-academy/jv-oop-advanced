package core.basesyntax;

public class CoolFigures {
    public static void main(String[] args) {
        printFigures(drawArrayOfRandomFigures(6));
    }

    public static Figure[] drawArrayOfRandomFigures(int n) {
        Figure[] randomFigures = new Figure[n];
        FigureSupplier newFigure = new FigureSupplier();
        for (int i = 0; i < n; i++) {
            randomFigures[i] = newFigure.getRandomFigure();
        }
        return randomFigures;
    }

    public static void printFigures(Figure[] figures) {
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
