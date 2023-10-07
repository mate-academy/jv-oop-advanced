package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {     // констант
            if (i < 3) {
               figures[i] = FigureSupplier.getRandomFigure().draw();
            }
            if (i >= 3) {
                figures[i] = FigureSupplier.getDefaultFigure().draw();

            }
        }
    }
}