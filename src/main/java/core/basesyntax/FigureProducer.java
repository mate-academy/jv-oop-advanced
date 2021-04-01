package core.basesyntax;

public class FigureProducer {

    private static final int RANDOM_NUMBER = 5;
    private static String [] figureArr = { "SQUARE", "RECTANGLE", "RIGHT TRIANGLE",
            "CIRCLE", "ISOSCELES TRAPEZOID" };

    public static Figure getRandomFigure() {
        int randomFigureNumber = (int)(Math.random() * figureArr.length);

        switch (randomFigureNumber) {
            case 0:
                return new Circle(figureArr[randomFigureNumber], ColorSupplier.getRandomColor(),
                        getRandomNumber());
            case 1:
                return new IsoscelesTrapezoid(figureArr[randomFigureNumber],
                        ColorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
            case 2:
                return new Rectangle(figureArr[randomFigureNumber],
                        ColorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new RightTriangle(figureArr[randomFigureNumber],
                        ColorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            default:
                return new Square(figureArr[randomFigureNumber], ColorSupplier.getRandomColor(),
                        getRandomNumber());
        }

    }

    private static int getRandomNumber() {
        return (int)((Math.random() * RANDOM_NUMBER) + 1);
    }
}
