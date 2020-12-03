package core.basesyntax;

import java.util.Random;

public class FiguresProducer {
    static final int NUMBER_OF_FIGURES = 4;
    static final int POSSIBLE_ARGUMENT = 20;
    static final int POSSIBLE_FIGURES = 20;

    public int getRandomNumber() {
        return new Random().nextInt(POSSIBLE_ARGUMENT);
    }

    public Color getRandomColor() {
        int randomGenaratedIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomGenaratedIndex];
    }

    public Figure[] getRandomFigure() {
        int arraySize = new Random().nextInt(POSSIBLE_FIGURES);
        Figure[] figureArray = new Figure[arraySize];
        for (int i = 0; i < figureArray.length; i++) {
            int randomGenaratedIndex = new Random().nextInt(NUMBER_OF_FIGURES);
            switch (randomGenaratedIndex) {
                case 0:
                    figureArray[i] = new Circle(getRandomNumber(),getRandomColor());
                    continue;
                case 1:
                    figureArray[i] = new IsoscelesTrapezoid(getRandomNumber(),
                            getRandomNumber(),getRandomNumber(),getRandomColor());
                    continue;
                case 2:
                    figureArray[i] = new Rectangle(getRandomNumber(),
                            getRandomNumber(),getRandomColor());
                    continue;
                case 3:
                    figureArray[i] = new RightTriangle(getRandomNumber(),
                            getRandomNumber(),getRandomColor());
                    continue;
                case 4:
                default:
                    figureArray[i] = new Square(getRandomNumber(),getRandomColor());
                    continue;
            }
        }
        for (Figure eachFigure:figureArray) {
            System.out.println(eachFigure.draw());
        }
        return figureArray;
    }
}

