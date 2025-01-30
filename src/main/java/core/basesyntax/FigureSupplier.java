package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random rd = new Random();
        int randomNumber = rd.nextInt(4);
        double maxDouble = 200.0;
        String randomColor = new ColorSupplier().getRandomColor();

        switch (randomNumber) {
            case 0:
                return new Circle(randomColor, rd.nextDouble(maxDouble));

            case 1:
                return new IsoscelesTrapezoid(
                    randomColor, 
                    rd.nextDouble(maxDouble),
                    rd.nextDouble(maxDouble),
                    rd.nextDouble(maxDouble)
                );
            
            case 2:
                return new Rectangle(
                    randomColor,
                    rd.nextDouble(maxDouble),
                    rd.nextDouble(maxDouble)
                );

            case 3:
                return new RightTriangle(
                    randomColor,rd.nextDouble(maxDouble),
                    rd.nextDouble(maxDouble),
                    rd.nextDouble(maxDouble)
                );

            default:
                return new Square(randomColor, rd.nextDouble(maxDouble));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Colors.WHITE), 10.0);
    }
}
