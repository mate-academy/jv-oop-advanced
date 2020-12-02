package core.basesyntax;

import java.util.Random;

public class FiguresProducer {
    public Figure[] getRandomFigure() {
        int arraySize = new Random().nextInt(20);
        Figure[] figureArray = new Figure[arraySize];
        for (int i = 0; i < figureArray.length; i++) {
            int randomGenaratedIndex = new Random().nextInt(4);
            switch (randomGenaratedIndex) {
                case 0:
                    figureArray[i] = new Circle();
                    continue;
                case 1:
                    figureArray[i] = new IsoscelesTrapezoid();
                    continue;
                case 2:
                    figureArray[i] = new Rectangle();
                    continue;
                case 3:
                    figureArray[i] = new RightTriangle();
                    continue;
                case 4:
                default:
                    figureArray[i] = new Square();
                    continue;
            }
        }
        for (Figure eachFigure:figureArray) {
            System.out.println(eachFigure.toString());
        }
        return figureArray;
    }
}
       /* public Figure [] figureGenerator(){
        int arraySize = new Random().nextInt(20);
        Figure [] figureArray=new Figure[arraySize];
        for(int i = 0; 0 < figureArray.length;i++){
            figureArray[i]=figureArray[i].getRandomFigure();
        }
        return figureArray;
        }
    }
*/
