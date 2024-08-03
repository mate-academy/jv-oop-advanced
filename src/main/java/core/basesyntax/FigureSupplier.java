package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier randomColor = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Name[] names = Name.values();
        int index = random.nextInt(names.length);
        if (names[index].toString().equals("SQUARE")) {
            return new Square(
                     random.nextDouble(),
                    randomColor.getRandomColor(),
                    names[index].name()
            );
        }
        if (names[index].toString().equals("RECTANGLE")) {
            return new Rectangle(
                          random.nextDouble(),
                          random.nextDouble(),
                          randomColor.getRandomColor(),
                          names[index].name()
                      );
        }
        if (names[index].toString().equals("RIGHT_TRIANGLE")) {
            return new RightTriangle(
                    random.nextDouble(),
                    random.nextDouble(),
                    randomColor.getRandomColor(),
                    names[index].name()
            );
        }
        if (names[index].toString().equals("CIRCLE")) {
            return new Circle(
                    random.nextDouble(),
                    randomColor.getRandomColor(),
                    names[index].name()
            );
        } else {
            return new IsoscelesTrapezoid(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble(),
                    randomColor.getRandomColor(),
                    names[index].name()
            );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10,"WHITE","CIRCLE");
    }
}
