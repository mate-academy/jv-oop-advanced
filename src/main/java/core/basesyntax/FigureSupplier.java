package core.basesyntax;

public class FigureSupplier extends ColorSupplier {
    public Figure getRandomFigure() {
        Randomizer randomizer = new Randomizer();
        Figure figure;
        switch (randomizer.getRandomNumber()) {
            case 1: figure = new RightTriangle(randomizer.getRandomNumber(),
                    randomizer.getRandomNumber());
                figure.setColor(getRandomColor());
                return figure;
            case 2: figure = new Circle(randomizer.getRandomNumber());
                figure.setColor(getRandomColor());
                return figure;
            case 3:
                figure = new Square(randomizer.getRandomNumber());
                figure.setColor(getRandomColor());
                return figure;
            case 4: figure = new IsoscelesTrapezoid(randomizer.getRandomNumber(),
                    randomizer.getRandomNumber(), randomizer.getRandomNumber());
                figure.setColor(getRandomColor());
                return figure;
            default:
                figure = new Rectangle(randomizer.getRandomNumber(), randomizer.getRandomNumber());
                figure.setColor(getRandomColor());
                return figure;
        }
    }
}
