package core.basesyntax.generator;

import core.basesyntax.Figure;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier extends Generator {
    public static Figure[] generateFigure(int num) {
        Figure[] figures = new Figure[num];
        Random random = new Random();

        for (int i = 0; i < num; i++) {
            int p = random.nextInt(Generator.getNumberOfFigures());
            int c = random.nextInt(16);
            double d = random.nextDouble();
            switch (p) {
                case 0:
                    figures[i] = new Circle(d + c, "circle");
                    break;
                case 1:
                    figures[i] = new IsoscelesTrapezoid(d + c, random.nextDouble()
                            + random.nextInt(16), random.nextDouble()
                            + random.nextInt(16), "isosceles trapezoid");
                    break;
                case 2:
                    figures[i] = new Rectangle(d + c, random.nextDouble()
                            + random.nextInt(16), "rectangle");
                    break;
                case 3:
                    figures[i] = new RightTriangle(d + c, random.nextDouble()
                            + random.nextInt(16), "right triangle");
                    break;
                case 4:
                    figures[i] = new Square(d + c, "square");
                    break;
                default:
                    break;
            }
        }
        return figures;
    }
}

