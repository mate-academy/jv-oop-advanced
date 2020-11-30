package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String...args) {
        printFigures(generateRandomFigureList());
    }

    private static List<Figure> generateRandomFigureList() {
        int initialCapacity = (int) ((Math.random() + 3) * 5);
        List<Figure> result = new ArrayList<>(initialCapacity);
        int iterator = 0;
        while (iterator < initialCapacity) {
            switch((int) (Math.random() * 4)) {
                case 0 :
                    result.add(new Circle());
                    break;
                case 1 :
                    result.add(new IsoscelesTrapezoid());
                    break;
                case 2 :
                    result.add(new Rectangle());
                    break;
                case 3 :
                    result.add(new RightTriangle());
                    break;
                case 4 :
                    result.add(new Square());
                    break;
                default :
                    break;
            }
        iterator++;
        }
        return result;
    }

    private static void printFigures(List<Figure> listOfFigures) {
        for (Figure figure : listOfFigures) {
            System.out.println(figure.draw());
        }
    }

}
