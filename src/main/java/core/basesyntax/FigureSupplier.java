package core.basesyntax;

public class FigureSupplier {
    public static int selectRandomFigure() {
        int minRandomNumber = 1;
        int maxRandomNumber = 5; // maximum is limited by amount of figures we can choose from
        int randomNumber = (int) Math.floor(Math.random()
                * (maxRandomNumber - minRandomNumber + 1) + minRandomNumber);

        if (randomNumber > maxRandomNumber || randomNumber < minRandomNumber) {
            System.out.println("Something went wrong with Random Number");
        }
        return randomNumber;
    }

    public static int selectRandomValue() {
        int minFigureSide = 1;
        int maxFigureSide = 20; //set figure parameters for random generation (radius, side etc)
        return (int) Math.floor(Math.random()
                * (maxFigureSide - minFigureSide + 1) + minFigureSide);
    }

    public static Figure getRandomFigure() {
        int selectFigure = selectRandomFigure();

        if (selectFigure == 1) {
            Circle randomCircle = new Circle();
            randomCircle.setRadius(selectRandomValue());
            randomCircle.setColor(ColorSupplier.getRandomColor());
            return randomCircle;
        }

        if (selectFigure == 2) {
            Square randomSquare = new Square();
            randomSquare.setSide(selectRandomValue());
            randomSquare.setColor(ColorSupplier.getRandomColor());
            return randomSquare;
        }

        if (selectFigure == 3) {
            Rectangle randomRectangle = new Rectangle();
            randomRectangle.setSideA(selectRandomValue());
            randomRectangle.setSideB(selectRandomValue());
            randomRectangle.setColor(ColorSupplier.getRandomColor());
            return randomRectangle;
        }

        if (selectFigure == 4) {
            RightTriangle randomRightTriangle = new RightTriangle();
            randomRightTriangle.setFirstLeg(selectRandomValue());
            randomRightTriangle.setSecondLeg(selectRandomValue());
            randomRightTriangle.setColor(ColorSupplier.getRandomColor());
            return randomRightTriangle;
        }

        if (selectFigure == 5) {
            IsoscelesTrapezoid randomIsoscelesTrapezoid = new IsoscelesTrapezoid();
            randomIsoscelesTrapezoid.setTopSide(selectRandomValue());
            randomIsoscelesTrapezoid.setBottomSide(selectRandomValue());
            randomIsoscelesTrapezoid.setHeight(selectRandomValue());
            randomIsoscelesTrapezoid.setColor(ColorSupplier.getRandomColor());
            return randomIsoscelesTrapezoid;
        }
        return new Square();
    }
}
