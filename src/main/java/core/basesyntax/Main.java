package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Shape;
import core.basesyntax.figures.Square;
import core.basesyntax.figures.Triangle;

public class Main {
    static final int COLORS = 6;

    public static void main(String[] args) {

        Shape[] figures = generateFigures(10);

        drawFigure(figures);
    }

    public static Shape[] generateFigures(int count) {
        Shape[] figures = new Shape[RandomNumber.getRandomNumber(count)];

        for (int i = 0; i < figures.length; i++) {
            switch (RandomNumber.getRandomNumber(COLORS)) {
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

        return figures;
    }

    public static void drawFigure(Shape[] figures) {
        for (Shape shape: figures) {
            shape.draw();
        }
    }
}
