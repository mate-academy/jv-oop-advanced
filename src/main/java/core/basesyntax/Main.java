package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Figure[] arrayOfFigure = new Figure[6];
        final int First_Half_Of_Array = 3;

        for (int i = 0; i < First_Half_Of_Array; i++) {
            arrayOfFigure[i] = FigureSupplier.getRandomFigure();
        }
        for (int i = First_Half_Of_Array; i < arrayOfFigure.length; i++) {
            arrayOfFigure[i] = FigureSupplier.getDefaultFigure();
        }
        for (int i = 0; i < arrayOfFigure.length; i++) {
            arrayOfFigure[i].draw();
            if (i >= First_Half_Of_Array || i == 1) {
                System.out.println();
            }
        }
    }
}

