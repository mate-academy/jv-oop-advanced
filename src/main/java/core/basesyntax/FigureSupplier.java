package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Randomizer randomizer = new Randomizer();
        Figure figure;
        switch (randomizer.getRandomNumber(1, 5)) {
            case 1: figure = new RightTriangle(randomizer.getRandomNumber(1, 5),
                    randomizer.getRandomNumber(1, 5));
                figure.setColor(colorSupplier.getRandomColor());
                return figure;
            case 2: figure = new Circle(randomizer.getRandomNumber(1, 5));
                figure.setColor(colorSupplier.getRandomColor());
                return figure;
            case 3:
                figure = new Square(randomizer.getRandomNumber(1, 5));
                figure.setColor(colorSupplier.getRandomColor());
                return figure;
            case 4: figure = new IsoscelesTrapezoid(randomizer.getRandomNumber(1, 5),
                    randomizer.getRandomNumber(1, 5), randomizer.getRandomNumber(1, 5));
                figure.setColor(colorSupplier.getRandomColor());
                return figure;
            default:
                figure = new Rectangle(randomizer.getRandomNumber(1, 5),
                        randomizer.getRandomNumber(1, 5));
                figure.setColor(colorSupplier.getRandomColor());
                return figure;
        }
    }
}
