package core.basesyntax;

import java.util.Random;

public class MainFigure {

    public static void main(String[] args) {
        // write your code here

        int figureNumber;
        Random random = new Random();
        final int figureCount = 5;

        String[] myFigure = {"square","rectangle","right triangle","circle","isosceles trapezoid"};

        FigureSupplier figureSupplier = new FigureSupplier();

        int quantityFigures = random.nextInt(figureCount) + 1;

        // array for excluding repeating
        int[] numbersFigures = new int[figureCount];

        for (int i = 0; i < quantityFigures; i++) {

            StringBuilder dimentions = new StringBuilder();
            figureNumber = random.nextInt(figureCount);

            // excluding repeating
            if (numbersFigures[figureNumber] == 1) {
                i--;
                continue;
            } else {
                numbersFigures[figureNumber] = 1;
            }

            StringBuilder outputFigure = new StringBuilder();

            outputFigure.append("Figure: ").append(myFigure[figureNumber]).append(", ");

            outputFigure.append(figureSupplier.getRandomFigure(figureNumber));

            ColorSupplier colourFigure = new ColorSupplier();
            String colourMyFigure = colourFigure.getRandomColor();
            outputFigure.append("color: ").append(colourMyFigure);

            System.out.println(outputFigure);
        }
    }
}

