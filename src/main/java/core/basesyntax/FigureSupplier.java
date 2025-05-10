package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 20;

    public Figure getRandomFigure() {
        int chooseFigure = 2;
        String randomColor = new ColorSupplier().getRandomColor();
        if (chooseFigure == 0) {
            Figure randomCircle = new Circle(randomColor,new Random().nextInt(MAX_NUMBER));
            return randomCircle;
        } else if (chooseFigure == 1) {
            int rnd1 = new Random().nextInt(MAX_NUMBER);
            int rnd2 = new Random().nextInt(MAX_NUMBER);
            Figure randomIsoscelesTrapezoid = new IsoscelesTrapezoid(randomColor,rnd1,rnd2);
            return randomIsoscelesTrapezoid;
        } else if (chooseFigure == 2) {
            int rnd1 = new Random().nextInt(MAX_NUMBER);
            int rnd2 = new Random().nextInt(MAX_NUMBER);
            Rectangle randomRectangle = new Rectangle(randomColor,rnd1,rnd2);
            return randomRectangle;
        } else if (chooseFigure == 3) {
            int rnd1 = new Random().nextInt(MAX_NUMBER);
            int rnd2 = new Random().nextInt(MAX_NUMBER);
            RightTriangle randomRightTriangle = new RightTriangle(randomColor,rnd1,rnd2);
            return randomRightTriangle;
        } else if (chooseFigure == 4) {
            Square randomSquare = new Square(randomColor, new Random().nextInt(MAX_NUMBER));
            return randomSquare;
        } else {
            return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Figure whiteCircle = new Circle("WHITE", 10);
        return whiteCircle;
    }
}
