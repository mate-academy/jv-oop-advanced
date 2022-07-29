package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    static final int MAX_COUN_FIGURE = 5;
    static final int MAX_POS_NUMBER = 100;

    public Figure getRandomFigure() {
        Figure figure = null;
        Random random = new Random();
        switch (new Random().nextInt(MAX_COUN_FIGURE)) {
            case 0:
                figure = new Circle(random.nextInt(MAX_POS_NUMBER));
                break;
            case 1:
                figure = new IsoscelesTrapezoid(random.nextInt(MAX_POS_NUMBER),
                        random.nextInt(MAX_POS_NUMBER), random.nextInt(MAX_POS_NUMBER));
                break;
            case 2:
                figure = new Rectangle(random.nextInt(MAX_POS_NUMBER),
                        random.nextInt(MAX_POS_NUMBER));
                break;
            case 3:
                figure = new RightTriangle(random.nextInt(MAX_POS_NUMBER),
                        random.nextInt(MAX_POS_NUMBER));
                break;
            default:
                figure = new Square(random.nextInt(MAX_POS_NUMBER));
                break;

        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("WHITE");
        return circle;
    }
}
