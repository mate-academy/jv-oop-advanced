package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int figureNumber;
        double area = 0;
        Random random = new Random();

        String[] myFigure = {"square","rectangle","right triangle","circle","isosceles trapezoid"};

        FigureSupplier figureSupplier = new FigureSupplier();

        int quantityFigures = random.nextInt(FigureSupplier.FIGURE_COUNT)+1;
        //  System.out.println("Creating "+quantityFigures+" figures");

        // array for excluding repeating
        int[] numbersFigures = new int[FigureSupplier.FIGURE_COUNT];

        for (int i = 0; i < quantityFigures; i++) {

            StringBuilder dimentions = new StringBuilder();
            figureNumber = figureSupplier.getRandomFigure();

            // excluding repeating
            if (numbersFigures[figureNumber] == 1) {
               i--; continue;
            } else {
                numbersFigures[figureNumber] = 1;
            }

            switch (figureNumber) {
                case (0) -> {
                    int side = random.nextInt(25) + 1;
                    dimentions.append("side: ").append(side).append(" units, ");
                    Square square = new Square(side);
                    area = square.getArea();
                }
                case (1) -> {
                    int sideA = random.nextInt(25) + 1;
                    int sideB = random.nextInt(25) + 1;
                    dimentions.append("sideA: ").append(sideA).append(" units, ");
                    dimentions.append("sideB: ").append(sideB).append(" units, ");
                    Rectangle rectangle = new Rectangle(sideA, sideB);
                    area = rectangle.getArea();
                }
                case (2) -> {
                    int baseTriangle = random.nextInt(25) + 1;
                    int heightTriangle = random.nextInt(25) + 1;
                    dimentions.append("baseTriangle : ").append(baseTriangle).append(" units, ");
                    dimentions.append("heightTriangle: ").append(heightTriangle).append(" units, ");
                    RightTriangle rightTriangle = new RightTriangle(baseTriangle, heightTriangle);
                    area = rightTriangle.getArea();
                }
                case (3) -> {
                    int radius = random.nextInt(25) + 1;
                    dimentions.append("radius : ").append(radius).append(" units, ");
                    Circle circle = new Circle(radius);
                    area = circle.getArea();
                }
                case (4) -> {
                    int baseIsTrapezoid = random.nextInt(25) + 1;
                    int upbaseIsTrapezoid = random.nextInt(25) + 1;
                    int heihgtIsTrapezoid = random.nextInt(25) + 1;
                    dimentions.append("baseIsTrapezoid : ").append(baseIsTrapezoid).append(" units, ");
                    dimentions.append("upbaseIsTrapezoid : ").append(upbaseIsTrapezoid).append(" units, ");
                    dimentions.append("heihgtIsTrapezoid : ").append(heihgtIsTrapezoid).append(" units, ");
                    IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(baseIsTrapezoid, upbaseIsTrapezoid, heihgtIsTrapezoid);
                    area = isoscelesTrapezoid.getArea();
                }
            }

            StringBuilder outputFigure = new StringBuilder();
            outputFigure.append("Figure: ").append(myFigure[figureNumber]);
            outputFigure.append(", area: ").append(area).append(" sq.units, ").append(dimentions);

            ColorSupplier colourFigure = new ColorSupplier();
            String colourMyFigure = colourFigure.getRandomColor();
            outputFigure.append("color: ").append(colourMyFigure);

//        Figure: triangle, area: 12.5 sq.units, firstLeg: 7 units, secondLeg: 5 units, color: yellow

            System.out.println(outputFigure);
        }
    }

}

