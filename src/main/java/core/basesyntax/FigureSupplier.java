package core.basesyntax;

public class FigureSupplier {

    public Figure randomFigure() {
        int figureIndex = (int) (Math.random() * 5);

        switch (figureIndex) {
            case 1: Figure randomSquare = new Square("square",
                    ColorSupplier.randomColor(), (int) (Math.random() * 16));
                    return randomSquare;
            case 2: Figure randomRightTriangle = new RightTriangle("right triangle",
                    ColorSupplier.randomColor(), (int) (Math.random() * 16));
                    return randomRightTriangle;
            case 3: Figure randomRectangle = new Rectangle("rectangle",
                    ColorSupplier.randomColor(), (int) (Math.random() * 16),
                    (int) (Math.random() * 5));
                    return randomRectangle;
            case 4: Figure randomIsoscelesTrapezoid = new IsoscelesTrapezoid("isosceles trapezoid",
                    ColorSupplier.randomColor(), (int) (Math.random() * 16),
                    (int) (Math.random() * 16), (int) (Math.random() * 8));
                    return randomIsoscelesTrapezoid;
            default: Figure randomCircle = new Circle("circle", ColorSupplier.randomColor(),
                    (int) (Math.random() * 16));
                    return randomCircle;
        }
    }
}
