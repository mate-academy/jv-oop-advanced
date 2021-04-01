package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        RandomNumberGenerator numberGenerator = new RandomNumberGenerator();
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomNumber = numberGenerator.getRandomNumber();

        if (randomNumber == 1) {
            return new Circle("circle",
                    colorSupplier.getRandomColor(),
                    numberGenerator.getRandomProperty());
        } else if (randomNumber == 2) {
            return new IsoscelesTrapezoid("isosceles trapezoid",
                    colorSupplier.getRandomColor(),
                    numberGenerator.getRandomNumber(),
                    numberGenerator.getRandomNumber(),
                    numberGenerator.getRandomProperty());
        } else if (randomNumber == 3) {
            return new Rectangle("rectangle",
                    colorSupplier.getRandomColor(),
                    numberGenerator.getRandomNumber(),
                    numberGenerator.getRandomProperty());
        } else if (randomNumber == 4) {
            return new RightTriangle("right triangle",
                    colorSupplier.getRandomColor(),
                    numberGenerator.getRandomNumber(),
                    numberGenerator.getRandomNumber());
        } else if (randomNumber == 5) {
            return new Square("square",
                    colorSupplier.getRandomColor(),
                    numberGenerator.getRandomProperty());
        } else {
            return null;
        }
    }
}
