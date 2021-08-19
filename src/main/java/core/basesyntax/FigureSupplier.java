package core.basesyntax;

import core.basesyntax.behaviour.Figure;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier randomColor = new ColorSupplier();
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        switch (randomNumber) {
            case (0):
                return new Circle(randomColor.getRandomColor(), random.nextInt(100));
            case (1):
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                        random.nextInt(100), random.nextInt(100), random.nextInt(100));
            case (2):
                return new Rectangle(randomColor.getRandomColor(),
                        random.nextInt(100), random.nextInt(100));
            case (3):
                return new RightTriangle(randomColor.getRandomColor(),
                        random.nextInt(100), random.nextInt(100));
            case (4):
                return new Square(randomColor.getRandomColor(), random.nextInt(100));
            default:
                System.out.println("Mistake something went wrong!");
        }
        return null;
    }
}



