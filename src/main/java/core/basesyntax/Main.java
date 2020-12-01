package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Shape;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Triangle;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Shape[] figures = new Shape[random.nextInt(10) + 1];

        for (int i = 0; i < figures.length; i++) {
            switch (random.nextInt(6) + 1) {
                case 1: {
                    figures[i] = new Square();
                    break;
                }
                case 2: {
                    figures[i] = new Triangle();
                    break;
                }
                case 3: {
                    figures[i] = new Rectangle();
                    break;
                }
                case 4: {
                    figures[i] = new RightTriangle();
                    break;
                }
                case 5: {
                    figures[i] = new Circle();
                    break;
                }
                case 6: {
                    figures[i] = new IsoscelesTrapezoid();
                    break;
                }
                default: break;
            }
        }

        for (Shape shape: figures) {
            shape.draw();
        }
    }
}
