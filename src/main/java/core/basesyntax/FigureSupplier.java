package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_LIMIT = 100;
    private Random random = new Random();
    private int numRows = random.nextInt(10) + 1;
    private int numCols = 1;
    private Figure[][] figureInfoArray = new Figure[numRows][numCols];

    public void fillFigureArray() {
        ColorSupplier colorSupplier = new ColorSupplier();

        // Fill the first half of the array with random figures
        for (int i = 0; i < numRows / 2; i++) {
            for (int j = 0; j < numCols; j++) {
                if (random.nextBoolean()) {
                    // Create a Circle
                    int radius = random.nextInt(NUMBER_LIMIT) + 1;
                    Color color = colorSupplier.getRandomColor();
                    figureInfoArray[i][j] = new Circle(radius, color);
                } else if (random.nextBoolean()) {
                    // Create an IsoscelesTrapezoid
                    int height = random.nextInt(NUMBER_LIMIT) + 1;
                    int smallerSide = random.nextInt(NUMBER_LIMIT) + 1;
                    int biggerSide = random.nextInt(NUMBER_LIMIT) + 1;
                    Color color = colorSupplier.getRandomColor();
                    figureInfoArray[i][j] = new
                            IsoscelesTrapezoid(height, smallerSide, biggerSide, color);
                } else if (random.nextBoolean()) {
                    // Create a Rectangle
                    int width = random.nextInt(NUMBER_LIMIT) + 1;
                    int length = random.nextInt(NUMBER_LIMIT) + 1;
                    Color color = colorSupplier.getRandomColor();
                    figureInfoArray[i][j] = new Rectangle(width, length, color);
                } else if (random.nextBoolean()) {
                    // Create a RightTriangle
                    int firstLeg = random.nextInt(NUMBER_LIMIT) + 1;
                    int secondLeg = random.nextInt(NUMBER_LIMIT) + 1;
                    Color color = colorSupplier.getRandomColor();
                    figureInfoArray[i][j] = new RightTriangle(firstLeg, secondLeg, color);
                } else {
                    // Create a Square
                    int generalSide = random.nextInt(NUMBER_LIMIT) + 1;
                    Color color = colorSupplier.getRandomColor();
                    figureInfoArray[i][j] = new Square(generalSide, color);
                }
            }
        }

        //Print information about default figure
        for (int i = numRows / 2; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                figureInfoArray[i][j] = getDefaultFigure();
            }
        }
    }

    public Figure[][] getFigureInfoArray() {
        return figureInfoArray;
    }

    public Figure getDefaultFigure() {
        return new DefaultFigure();
    }

    public void drawFigureInfoArray() {
        Figure[][] figureInfoArray = getFigureInfoArray();
        // Call the getFigureInfo method for each figure in the array
        for (Figure[] row : figureInfoArray) {
            for (Figure figure : row) {
                if (figure != null) {
                    String figureInfo = figure.getFigureInfo();
                    System.out.println(figureInfo);
                }
            }
        }
    }

}
