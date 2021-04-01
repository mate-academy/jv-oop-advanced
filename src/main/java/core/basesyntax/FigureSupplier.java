package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int randomNumber = new RandomNumberGenerator().getRandomNumber();
        if (randomNumber == 1) {
            return new Circle("circle");
        } else if (randomNumber == 2) {
            return new IsoscelesTrapezoid("isosceles trapezoid");
        } else if (randomNumber == 3) {
            return new Rectangle("rectangle");
        } else if (randomNumber == 4) {
            return new RightTriangle("right triangle");
        } else if (randomNumber == 5) {
            return new Square("square");
        } else {
            return null;
        }
    }
}
