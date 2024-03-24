package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int numRows = 5;
        int numCols = 1;
        Figure[][] figureInfoArray = new Figure[numRows][numCols];
        for (int i = 0; i < numRows / 2; i++) {
            for (int j = 0; j < numCols; j++) {
                figureInfoArray[i][j] = figureSupplier.getRandomFigure();
            }
        }
        for (int i = numRows / 2; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                figureInfoArray[i][j] = figureSupplier.getDefaultFigure();
            }
        }
        //Print the array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.println(figureInfoArray[i][j]);
            }
        }
    }
}
