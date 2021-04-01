package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        RandomNumberGenerator numberGenerator = new RandomNumberGenerator();
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        double randomProperty = numberGenerator.getRandomProperty();
        int randomNumber = numberGenerator.getRandomNumber();

        if (randomNumber == 1) {
            return new Circle("circle", randomColor, randomProperty);
        } else if (randomNumber == 2) {
            return new IsoscelesTrapezoid("isosceles trapezoid",
                    randomColor, 10, 12, randomProperty);
        } else if (randomNumber == 3) {
            return new Rectangle("rectangle",
                    randomColor, 8, randomProperty);
        } else if (randomNumber == 4) {
            return new RightTriangle("right triangle",
                    randomColor, 12, 14);
        } else if (randomNumber == 5) {
            return new Square("square", randomColor, randomProperty);
        } else {
            return null;
        }
    }
}
