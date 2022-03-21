package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SIZE_LIMIT = 30;
    private static final int FIGURE_OPTION = 5;

    public Figure getRandomFigure() {
        Random r = new Random();
        ColorSupplier randomColor = new ColorSupplier();
        int f = r.nextInt(FIGURE_OPTION);
        int param = r.nextInt(SIZE_LIMIT);

        switch (f) {
            case 1:
                Figure res = new Circle(param);
                res.setColor(Color.valueOf(randomColor.getRandomColor()));
                return res;
            case 2:
                Figure res2 = new Square(param);
                res2.setColor(Color.valueOf(randomColor.getRandomColor()));
                return res2;
            case 3:
                Figure res3 = new Rectangle(param, param);
                res3.setColor(Color.valueOf(randomColor.getRandomColor()));
                return res3;
            case 4:
                Figure res4 = new RightTriangle(param, param);
                res4.setColor(Color.valueOf(randomColor.getRandomColor()));
                return res4;
            default:
                Figure res5 = new Trapezoid(param, param, param);
                res5.setColor(Color.valueOf(randomColor.getRandomColor()));
                return res5;
        }

    }

    public Figure getDefaultFigure() {
        Figure defaultCircle = new Circle(10);
        defaultCircle.setColor(Color.WHITE);
        return defaultCircle;
    }
}
