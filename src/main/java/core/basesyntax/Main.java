package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numRows = random.nextInt(10) + 1;
        int numCols = 1;
        Figure[][] figureInfoArray = new Figure[numRows][numCols];
        ColorSupplier colorSupplier = new ColorSupplier();
        // Fill the first half of the array with random figures
        for (int i = 0; i < numRows / 2; i++) {
            for (int j = 0; j < numCols; j++) {
                if (random.nextBoolean()) {
                    // Create a Circle
                    int radius = random.nextInt(100) + 1;
                    Color color = colorSupplier.getRandomColor();
                    figureInfoArray[i][j] = new Circle(radius, color);
                } else if (random.nextBoolean()) {
                    // Create an IsoscelesTrapezoid
                    int height = random.nextInt(100) + 1;
                    int smallerSide = random.nextInt(100) + 1;
                    int biggerSide = random.nextInt(100) + 1;
                    Color color = colorSupplier.getRandomColor();
                    figureInfoArray[i][j] = new
                            IsoscelesTrapezoid(height, smallerSide, biggerSide, color);
                } else if (random.nextBoolean()) {
                    // Create a Rectangle
                    int width = random.nextInt(100) + 1;
                    int length = random.nextInt(100) + 1;
                    Color color = colorSupplier.getRandomColor();
                    figureInfoArray[i][j] = new Rectangle(width, length, color);
                } else if (random.nextBoolean()) {
                    // Create a RightTriangle
                    int firstLeg = random.nextInt(100) + 1;
                    int secondLeg = random.nextInt(100) + 1;
                    Color color = colorSupplier.getRandomColor();
                    figureInfoArray[i][j] = new RightTriangle(firstLeg, secondLeg, color);
                } else {
                    // Create a Square
                    int generalSide = random.nextInt(100) + 1;
                    Color color = colorSupplier.getRandomColor();
                    figureInfoArray[i][j] = new Square(generalSide, color);
                }
            }
        }

        FigureSupplier figureSupplier = new FigureSupplier();
        //Print information about default figure
        for (int i = numRows / 2; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                figureInfoArray[i][j] = figureSupplier.getDefaultFigure();
            }
        }
        // Print information about each figure
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (figureInfoArray[i][j] != null) {
                    System.out.println(figureInfoArray[i][j].getFigureInfo());
                } else {
                    System.out.println("No figure at position [" + i + "][" + j + "]");
                }
            }
        }
    }
}
