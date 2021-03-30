package core.basesyntax;

import core.basesyntax.figures.*;

import java.util.Random;

public class Main<figure> {
        Random random = new Random();
        int figure = random.nextInt(4);
        int sizeMax = 100;
        switch (figure) {
            case 0:
                Figure circle = new Circle(random.nextInt(sizeMax));
            case 1:
                Figure rectangle = new Rectangle(random.nextInt(sizeMax), random.nextInt(sizeMax));
            case 2:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(sizeMax), random.nextInt(sizeMax), random.nextInt(sizeMax));
            case 3:
                Figure rightTriangle = new RightTriangle(random.nextInt(sizeMax));
            default:
                Figure square = new Square(random.nextInt(sizeMax));
        }
}
