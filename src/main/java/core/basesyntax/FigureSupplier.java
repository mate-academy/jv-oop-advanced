package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Randomizer randomizer = new Randomizer();
        Figure figure;
        switch (randomizer.getRandomNumber(Randomizer.MIN, Randomizer.MAX)) {
            case 1:
                figure = new RightTriangle(
                randomizer.getRandomNumber(Randomizer.MIN, Randomizer.MAX),
                    randomizer.getRandomNumber(Randomizer.MIN, Randomizer.MAX));
                figure.setColor(colorSupplier.getRandomColor());
                return figure;
            case 2: figure = new Circle(randomizer.getRandomNumber(Randomizer.MIN, Randomizer.MAX));
                figure.setColor(colorSupplier.getRandomColor());
                return figure;
            case 3: figure = new Square(randomizer.getRandomNumber(Randomizer.MIN, Randomizer.MAX));
                figure.setColor(colorSupplier.getRandomColor());
                return figure;
            case 4:
                figure = new IsoscelesTrapezoid(
                randomizer.getRandomNumber(Randomizer.MIN, Randomizer.MAX),
                    randomizer.getRandomNumber(Randomizer.MIN, Randomizer.MAX),
                    randomizer.getRandomNumber(Randomizer.MIN, Randomizer.MAX));
                figure.setColor(colorSupplier.getRandomColor());
                return figure;
            default:
                figure = new Rectangle(randomizer.getRandomNumber(Randomizer.MIN, Randomizer.MAX),
                        randomizer.getRandomNumber(Randomizer.MIN, Randomizer.MAX));
                figure.setColor(colorSupplier.getRandomColor());
                return figure;
        }
    }
}
