package core.basesyntax;

public class FigureProducer {
    private int randomNumber = 5;
    private String [] figureArr = { "SQUARE", "RECTANGLE", "RIGHT TRIANGLE",
            "CIRCLE", "ISOSCELES TRAPEZOID" };

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();

        int randomFigureNumber = (int)(Math.random() * figureArr.length);

        switch (randomFigureNumber) {
            case 0:
                return new Circle(figureArr[randomFigureNumber], colorSupplier.getRandomColor(),
                        getRandomNumber());
            case 1:
                return new IsoscelesTrapezoid(figureArr[randomFigureNumber],
                        colorSupplier.getRandomColor(), getRandomNumber(),
                        getRandomNumber(), getRandomNumber());
            case 2:
                return new Rectangle(figureArr[randomFigureNumber],
                        colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            case 3:
                return new RightTriangle(figureArr[randomFigureNumber],
                        colorSupplier.getRandomColor(),
                        getRandomNumber(), getRandomNumber());
            default:
                return new Square(figureArr[randomFigureNumber], colorSupplier.getRandomColor(),
                        getRandomNumber());
        }

    }

    private int getRandomNumber() {
        return (int)((Math.random() * randomNumber) + 1);
    }
}
