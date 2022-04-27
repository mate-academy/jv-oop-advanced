package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int ran = new Random().nextInt(5);
        int a = new Random().nextInt(10) + 2;
        int b = new Random().nextInt(10) + 2;
        int c = new Random().nextInt(10) + 2;
        switch (ran) {
            case (0):
                Figure sq = new Square(a);
                return sq;
            case (1):
                Figure re = new Rectangle(a, b);
                return re;
            case (2):
                Figure rt = new RightTriangle(a, b);
                return rt;
            case (3):
                Figure cr = new Circle(a);
                return cr;
            default:
                Figure it = new IsoscelesTrapezoid(a, b, c);
                return it;
        }

    }
    
    public Figure getDefaultFigure() {
        Figure x = new Square(10, "white");
        return x;
    }
}
