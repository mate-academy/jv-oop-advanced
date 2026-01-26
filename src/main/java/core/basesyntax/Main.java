package core.basesyntax;

import java.util.Random;

public class Main {
    private static Figure [] figures = {new Square(), new Rectangle(), new RightTriangle(),
            new IsoscelesTrapezoid(), new Circle()};

    public static void main(String[] args) {
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }

    }
}
