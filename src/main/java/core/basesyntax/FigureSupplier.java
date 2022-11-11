package core.basesyntax;

import java.util.Random;
public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
      private static final int MAX_NUMBER = 6;
    private Random random = new Random();
    private  ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure(int value) {
        int randomNum = random.nextInt(MAX_NUMBER);

        switch (value) {
            case 1:
                return new Circle(randomColor.getRandomColor(), random.nextInt(randomNum));

            case 2:
                return new Rectangle(randomColor.getRandomColor(), random.nextInt(randomNum), random.nextInt(randomNum));

            case 3:
                return new Square(randomColor.getRandomColor(), random.nextInt(randomNum));

            case 4:
                return new RightTriangle(randomColor.getRandomColor(), random.nextInt(randomNum), random.nextInt(randomNum));

            case 5:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(), random.nextInt(randomNum), random.nextInt(randomNum), random.nextInt(randomNum));

            default:
                return new Square(DEFAULT_COLOR, MAX_NUMBER);
        }
    }

    public Figure getDefaultFigure () {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
