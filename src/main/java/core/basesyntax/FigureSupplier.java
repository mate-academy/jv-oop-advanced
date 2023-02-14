package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        Color color = ColorSupplier.getRandomColor();
        Figure figure;
        FigureSupplier supplier = new FigureSupplier();
        int index = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[index]) {
            case CIRCLE :
                figure = new Circle(color, random.nextInt());
                break;
            case SQUARE :
                figure = new Square();
                break;
            case RECTANGLE :
                figure = new Rectangle();
                break;
            case RIGHTTRIANGLE:
                figure = new RightTriangle();
                break;
            case ISOSCELESTRAPESOID :
                figure = new IsoscelesTrapezoid();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(Color.WHITE, 10);
        return figure;
    }

}
