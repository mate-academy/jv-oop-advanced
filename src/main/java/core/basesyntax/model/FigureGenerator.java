package core.basesyntax.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FigureGenerator {
    public static final int NUMBER_OF_FIGURES = 5;

    public static List<Figure> generateRandomFigureList() {
        int initialCapacity = (int) ((Math.random() + 3) * NUMBER_OF_FIGURES);
        List<Figure> result = new ArrayList<>(initialCapacity);
        int iterator = 0;
        while (iterator < initialCapacity) {
            switch ((int) (Math.random() * NUMBER_OF_FIGURES)) {
                case 0 :
                    result.add(generateRandomCircle());
                    break;
                case 1 :
                    result.add(generateRandomIsoscelesTrapezoid());
                    break;
                case 2 :
                    result.add(generateRandomRectangle());
                    break;
                case 3 :
                    result.add(generateRandomRightTriangle());
                    break;
                default :
                    result.add(generateRandomSquare());
                    break;
            }
            iterator++;
        }
        return result;
    }

    private static Color generateRandomColor() {
        Color[] values = Color.values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex];
    }

    private static Circle generateRandomCircle() {
        return new Circle((int) (Math.random() * 19) + 1, generateRandomColor());
    }

    private static IsoscelesTrapezoid generateRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                (int) (Math.random() * 99) + 1,
                (int) (Math.random() * 9) + 1,
                (int) (Math.random() * 12) + 1,
                (int) (Math.random() * 15) + 1,
                generateRandomColor());
    }

    private static Rectangle generateRandomRectangle() {
        return new Rectangle(
                (int) (Math.random() * 5) + 1,
                (int) (Math.random() * 15) + 1,
                generateRandomColor());
    }

    private static Square generateRandomSquare() {
        return new Square((int) (Math.random() * 10) + 1, generateRandomColor());
    }

    private static RightTriangle generateRandomRightTriangle() {
        return new RightTriangle(
                (int) (Math.random() * 20) + 1,
                (int) (Math.random() * 12) + 1,
                (int) (Math.random() * 9) + 1,
                generateRandomColor());
    }
}
