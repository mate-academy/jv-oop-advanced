package core.basesyntax;

import core.basesyntax.behaviour.Figure;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = this.random.nextInt(4);
        switch (randomNumber) {
            case (0):
                return this.getCircle();
            case (1):
                return this.getIsoscelesTrapezoid();
            case (2):
                return this.getRectangle();
            case (3):
                return this.getRightTriangle();
            case (4):
                return this.getSquare();
            default:
                System.out.println("Mistake something went wrong!");
        }
        return null;
    }

    private Figure getCircle() {
        int radius = this.random.nextInt(100);
        return new Circle(this.randomColor.getRandomColor(), radius);
    }

    private Figure getIsoscelesTrapezoid() {
        int topSide = this.random.nextInt(100);
        int botSide = this.random.nextInt(100);
        int height = this.random.nextInt(100);
        return new IsoscelesTrapezoid(this.randomColor.getRandomColor(),
                topSide, botSide, height);
    }

    private Figure getRectangle() {
        int height = this.random.nextInt(100);
        int width = this.random.nextInt(100);
        return new Rectangle(this.randomColor.getRandomColor(), height, width);
    }

    private Figure getRightTriangle() {
        int firstLeg = this.random.nextInt(100);
        int secondLeg = this.random.nextInt(100);
        return new RightTriangle(this.randomColor.getRandomColor(),
                firstLeg, secondLeg);
    }

    private Figure getSquare() {
        int side = this.random.nextInt(100);
        return new Square(this.randomColor.getRandomColor(), side);
    }
}



