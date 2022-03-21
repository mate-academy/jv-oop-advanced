package core.basesyntax;

import java.util.Random;

class FigureSupplier extends Figure {
    public FigureSupplier() {
    }

    public FigureSupplier(String nameFigure, int areaFigure,
                          int sideA, int sideB, String colorFigure) {
        super(nameFigure, areaFigure, sideA, sideB, colorFigure);
    }

    public FigureSupplier(String nameFigure, double areaFigure, int sideA,
                          int sideB, int height, String colorFigure) {
        super(nameFigure, areaFigure, sideA, sideB, height, colorFigure);
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new FigureSupplier();
        defaultFigure.setNameFigure("circle");
        defaultFigure.setSideA(10);
        defaultFigure.setColorFigure("white");
        defaultFigure.setAreaFigure(314);
        return defaultFigure;
    }

    public Figure getRandomFigure() {
        Figure randomFigure = new FigureSupplier();

        int index = new Random().nextInt(FigureList.values().length);
        randomFigure.setNameFigure(FigureList.values()[index].toString());

        if (randomFigure.getNameFigure().equals("circle")
                || randomFigure.getNameFigure().equals("square")
                || randomFigure.getNameFigure().equals("right_triangle")) {

            randomFigure.setSideA((int) (Math.random() * 40));

            if (randomFigure.getNameFigure().equals("circle")) {
                randomFigure.setAreaFigure(new Circle((int) randomFigure.getSideA()).getArea());
            } else if (randomFigure.getNameFigure().equals("square")) {
                randomFigure.setAreaFigure(new Square((int) randomFigure.getSideA()).getArea());
            } else {
                randomFigure.setAreaFigure(new RightTriangle((int)
                        randomFigure.getSideA()).getArea());
            }

            randomFigure.setColorFigure(new ColorSupplier().getRandomColor());

            return randomFigure;
        }

        if (randomFigure.getNameFigure().equals("rectangle")) {
            randomFigure.setSideA((int) (Math.random() * 40));
            randomFigure.setSideB((int) (Math.random() * 40));
            randomFigure.setAreaFigure(new Rectangle((int) randomFigure.getSideA(),
                    (int) randomFigure.getSideB()).getArea());

            randomFigure.setColorFigure(new ColorSupplier().getRandomColor());

            return randomFigure;
        }

        if (randomFigure.getNameFigure().equals("isosceles_trapezoid")) {
            randomFigure.setSideA((int) (Math.random() * 40));
            randomFigure.setSideB((int) (Math.random() * 40));
            randomFigure.setHeight((int) (Math.random() * 40));
            randomFigure.setAreaFigure(new IsoscelesTrapezoid((int) randomFigure.getSideA(),
                    (int) randomFigure.getSideB(),
                    (int) randomFigure.getHeight()).getArea());

            randomFigure.setColorFigure(new ColorSupplier().getRandomColor());

            return randomFigure;
        }

        return randomFigure;

    }
}
