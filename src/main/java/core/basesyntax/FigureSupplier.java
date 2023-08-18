package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private double randomNumber;

    public Figure getRandomFigure() {
        getRandomFigureNumber();
        ColorSupplier colorSupplier = new ColorSupplier();
        if (randomNumber == 0) {
            return new Circle("RandomCircle",
                    colorSupplier.getRandomColor().toString(),
                    getRandomSide());
        } else if (randomNumber == 1) {
            return new Square("RandomSquare",
                    colorSupplier.getRandomColor().toString(),
                    getRandomSide());
        } else if (randomNumber == 2) {
            return new Rectangle("RandomRectangle",
                    getDefaultFigure().getColor(),
                    getRandomSide(),
                    getRandomSide());
        } else if (randomNumber == 3) {
            return new IsoscelesTrapezoid("RandomIsoscelesTrapezoid",
                    getDefaultFigure().getColor(),
                    getRandomSide(),
                    getRandomSide(),
                    getRandomSide());
        } else {
            return new RightTriangle("RandomRightTriangle",
                    getDefaultFigure().getColor(),
                    getRandomSide(),
                    getRandomSide());
        }
    }

    //get random number for chose random what figure create
    public void getRandomFigureNumber() {
        this.randomNumber = random.nextInt(5);
    }

    //get random number for create random figure parameters
    public double getRandomSide() {
        return randomNumber = random.nextInt(10) + 1;
    }

    //create default figure
    public Figure getDefaultFigure() {
        return new Circle("defaultFigure", "white", 10);
    }

}
