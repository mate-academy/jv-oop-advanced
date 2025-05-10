package core.basesyntax;

public class FigureProducer {

    private static final int RANDOM_NUMBER = 5;

    private static final String [] FIGUREARR = { "SQUARE", "RECTANGLE", "RIGHT TRIANGLE",
            "CIRCLE", "ISOSCELES TRAPEZOID" };

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();

        int randomFigureNumber = (int)(Math.random() * FIGUREARR.length);

        switch (randomFigureNumber) {
            case 0:
                return new Circle(FIGUREARR[randomFigureNumber], colorSupplier.getRandomColor(),
                        getRandomNumber());
            case 1:
                return new IsoscelesTrapezoid(FIGUREARR[randomFigureNumber],
                        colorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
            case 2:
                return new Rectangle(FIGUREARR[randomFigureNumber],
                        colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new RightTriangle(FIGUREARR[randomFigureNumber],
                        colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            default:
                return new Square(FIGUREARR[randomFigureNumber], colorSupplier.getRandomColor(),
                        getRandomNumber());
        }

    }

    private int getRandomNumber() {

        return (int)((Math.random() * RANDOM_NUMBER) + 1);
    }
}
