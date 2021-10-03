package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
        static public String[] figures = new String[] {"Square", "Rectangle", "Circle", "Right Triangle", "Isosceles Trapezoid"};
        static int maxSideSize = 10;
        static Random rand = new Random();
        public static Figure getRandomFigure() {
            switch (rand.nextInt(figures.length)) {
                case 1: Random randomSquare = new Random();
                        return new Square(randomSquare.nextInt(maxSideSize) + 1, ColorSupplier.getRandomColor());
                case 2: Random randomRectSideA = new Random();
                        Random randomRectSideB = new Random();
                        return new Rectangle(randomRectSideA.nextInt(maxSideSize) + 1, randomRectSideB.nextInt(maxSideSize) + 1, ColorSupplier.getRandomColor());
                case 3: Random randomRadius = new Random();
                        return new Circle(randomRadius.nextInt(maxSideSize) + 1, ColorSupplier.getRandomColor());
                case 4: Random randomFirstLeg = new Random();
                        Random randomSecondLeg = new Random();
                        return new RightTriangle(randomFirstLeg.nextInt(maxSideSize) + 1, randomSecondLeg.nextInt(maxSideSize) + 1, ColorSupplier.getRandomColor());
                default: Random randomSideA = new Random();
                        Random randomSideB = new Random();
                        Random randomHeight = new Random();
                        return new IsoscelesTrapezoid(randomSideA.nextInt(maxSideSize) + 1, randomSideB.nextInt(maxSideSize) + 1, randomHeight.nextInt(maxSideSize) + 1, ColorSupplier.getRandomColor());
            }
            //return new Square(ColorSupplier.getRandomColor());
        }
}

