package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
          private ColorSupplier colorSupplier = new ColorSupplier();
          private final int RANDOM_NUMBER = 5;
          private final int RANDOM_PARAMETER = 25;
          private String[] figuresArray = new String[]{"Square", "Circle", "RightTriangle",
                  "Rectangle", "IsoscelesTrapezoid"};

    public Shape getRandomFigure() {
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        String shapeKind = figuresArray[new Random().nextInt(RANDOM_NUMBER)];
        switch (shapeKind) {
/*            case "Square":
                return new Square(color, getRandomNumber());*/
            case "Circle":
                 return new Circle(color,getRandomNumber());
            case "Right Triangle":
                  return new RightTriangle(color,getRandomNumber(), getRandomNumber());
            case "Rectangle":
                  return new Rectangle(color,getRandomNumber(), getRandomNumber());
            case "IsoscelesTrapezoid":
                 return new IsoscelesTrapezoid(color,getRandomNumber(), getRandomNumber(),
                         getRandomNumber());

        }
        return new Square(color, getRandomNumber());
    }

    private double getRandomNumber() {
        return new Random().nextInt(RANDOM_PARAMETER);
    }

}
