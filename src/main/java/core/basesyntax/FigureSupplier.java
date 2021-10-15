package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();

    public String getRandomFigure(int figureNumber) {

        double area = 0;
        StringBuilder parameters = new StringBuilder();

        switch (figureNumber) {
            case (0):
                int side = random.nextInt(25) + 1;
                parameters.append("side: ").append(side).append(" units, ");
                Square square = new Square(side);
                area = square.getArea();
                break;
            case (1):
                int sideA = random.nextInt(25) + 1;
                int sideB = random.nextInt(25) + 1;
                parameters.append("sideA: ").append(sideA).append(" units, ");
                parameters.append("sideB: ").append(sideB).append(" units, ");
                Rectangle rectangle = new Rectangle(sideA, sideB);
                area = rectangle.getArea();
                break;
            case (2):
                int baseTriangle = random.nextInt(25) + 1;
                int heightTriangle = random.nextInt(25) + 1;
                parameters.append("baseTriangle : ").append(baseTriangle).append(" units, ");
                parameters.append("heightTriangle: ").append(heightTriangle).append(" units, ");
                RightTriangle rightTriangle = new RightTriangle(baseTriangle, heightTriangle);
                area = rightTriangle.getArea();
                break;
            case (3):
                int radius = random.nextInt(25) + 1;
                parameters.append("radius : ").append(radius).append(" units, ");
                Circle circle = new Circle(radius);
                area = circle.getArea();
                break;
            case (4):
                int baseIsTrapezoid = random.nextInt(25) + 1;
                int upbaseIsTrapezoid = random.nextInt(25) + 1;
                int heihgtIsTrapezoid = random.nextInt(25) + 1;
                parameters.append("baseIsTrapezoid : ").append(baseIsTrapezoid).append(" units, ");
                parameters.append("upbaseIsTrapezoid : ").append(upbaseIsTrapezoid)
                        .append(" units, ");
                parameters.append("heihgtIsTrapezoid : ").append(heihgtIsTrapezoid)
                        .append(" units, ");
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                        baseIsTrapezoid, upbaseIsTrapezoid, heihgtIsTrapezoid);
                area = isoscelesTrapezoid.getArea();
                break;
            default: break;
        }
        StringBuilder parametersFigure = new StringBuilder();
        parametersFigure.append("area: ").append(area).append(" sq.units, ").append(parameters);
        return parametersFigure.toString();
    }
}
