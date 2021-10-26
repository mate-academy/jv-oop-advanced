package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int manyFigures = 10;

        for (int i = 0; i < manyFigures; ++i) {
            System.out.println(new FigureSupplier().getRandomFigure().printFigure());
        }
    }

}
