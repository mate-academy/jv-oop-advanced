package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int figureCount = 4;

    public Figure getRandomFigure() {
        Random rd = new Random();
        int randomNumber = rd.nextInt(figureCount);
        double maxDouble = 200.0;
        String randomColor = new ColorSupplier().getRandomColor();
        double randomNumber1 = rd.nextDouble(maxDouble);
        double randomNumber2 = rd.nextDouble(maxDouble);

        switch (randomNumber) {
            case 0:
                return new Circle(randomColor, randomNumber1);

            case 1:
                double randomNumber3 = rd.nextDouble(maxDouble);

                return new IsoscelesTrapezoid(
                    randomColor, 
                    randomNumber1,
                    randomNumber2,
                    randomNumber3
                );
            
            case 2:
                return new Rectangle(
                    randomColor,
                    randomNumber1,
                    randomNumber2
                );

            case 3:
                return new RightTriangle(
                    randomColor,randomNumber1,
                    randomNumber1,
                    randomNumber2
                );

            default:
                return new Square(randomColor, randomNumber1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Colors.WHITE), 10.0);
    }
}
