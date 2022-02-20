package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {

    public Figure getRandomFigure(Figures selectFigure){
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        Random random = new Random();
        switch (selectFigure) {
            case CIRCLE:
                int randomRadius = random.nextInt(100);
                Circle randomCircle = new Circle(randomRadius);
                randomCircle.setColor(randomColor);
                randomCircle.setArea(randomCircle.getAreaFigure());
                return randomCircle;
            case SQUARE:
                int randomSquareSide = random.nextInt(100);
                Square randomSquare = new Square(randomSquareSide);
                randomSquare.setColor(randomColor);
                randomSquare.setArea(randomSquare.getAreaFigure());
                return randomSquare;
            case RECTANGLE:
                int randomFirstSide = random.nextInt(100);
                int randomSecondSide = random.nextInt(100);
                Rectangle randomRectangle = new Rectangle(randomFirstSide, randomSecondSide);
                randomRectangle.setColor(randomColor);
                randomRectangle.setArea(randomRectangle.getAreaFigure());
                return randomRectangle;
            case RIGHT_TRIANGLE:
                int randomFirstLeg = random.nextInt(100);
                int randomSecondLeg = random.nextInt(100);
                RightTriangle randomTriangle = new RightTriangle(randomFirstLeg, randomSecondLeg);
                randomTriangle.setColor(randomColor);
                randomTriangle.setArea(randomTriangle.getAreaFigure());
                return randomTriangle;
            case ISOSCELES_TRAPEZOID:
                int randomHeigt = random.nextInt(100);
                int randomUpperBase = random.nextInt(100);
                int randomLowerBase = random.nextInt(100);
                IsoscelesTrapezoid randomTrapezoid = new IsoscelesTrapezoid(randomHeigt, randomUpperBase, randomLowerBase);
                randomTrapezoid.setColor(randomColor);
                randomTrapezoid.setArea(randomTrapezoid.getAreaFigure());
                return randomTrapezoid;
        }
        return  getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("WHITE");
        circle.setArea(circle.getAreaFigure());
        return circle;
    }
}
