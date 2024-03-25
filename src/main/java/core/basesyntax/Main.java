package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        String[] figureTypes = {"randFig", "randFig", "randFig", "defFig", "defFig", "defFig"};
        // Create the figureInfoArray based on the figure types
        int numRows = figureTypes.length;
        int numCols = 1;
        Figure[][] figureInfoArray = new Figure[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            // Set the figure based on the type
            if (figureTypes[i].equals("randFig")) {
                figureInfoArray[i][0] = figureSupplier.getRandomFigure();
            } else if (figureTypes[i].equals("defFig")) {
                figureInfoArray[i][0] = figureSupplier.getDefaultFigure();
            }
        }
        // Print the array
        for (int i = 0; i < numRows; i++) {
            System.out.println(figureInfoArray[i][0]);
        }
    }
}
