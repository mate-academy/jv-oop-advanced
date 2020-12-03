package core.basesyntax;

import java.util.Random;

public class FiguresProducer {
    static final int NUMBER_OF_FIGURES = 4;//total numbers of different elements (Figures)
    static final int POSSIBLE_ARGUMENT = 20;//max argument (excluded)
    static final int POSSIBLE_FIGURES = 20;//max Figures can be generated(excluded)

    public int getRandomNumber() {
        return new Random().nextInt(POSSIBLE_ARGUMENT);
    }

    public Figure[] getRandomFigure() {
        int arraySize = new Random().nextInt(POSSIBLE_FIGURES);
        Figure[] figureArray = new Figure[arraySize];
        for (int i = 0; i < figureArray.length; i++) {
            int randomGenaratedIndex = new Random().nextInt(NUMBER_OF_FIGURES);
            switch (randomGenaratedIndex) {
                case 0:
                    figureArray[i] = new Circle(getRandomNumber());
                    continue;
                case 1:
                    figureArray[i] = new IsoscelesTrapezoid(getRandomNumber(),
                            getRandomNumber(),getRandomNumber());
                    continue;
                case 2:
                    figureArray[i] = new Rectangle(getRandomNumber(),getRandomNumber());
                    continue;
                case 3:
                    figureArray[i] = new RightTriangle(getRandomNumber(),getRandomNumber());
                    continue;
                case 4:
                default:
                    figureArray[i] = new Square(getRandomNumber());
                    continue;
            }
        }
        for (Figure eachFigure:figureArray) {
            System.out.println(eachFigure.draw());
        }
        return figureArray;
    }
}

