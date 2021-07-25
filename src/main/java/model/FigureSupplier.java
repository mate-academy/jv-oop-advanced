package model;

public class FigureSupplier {
    public Figure getRandomFigure() {
        //creating parametr which will be used to choose figure
        int random = (int)(Math.random() * 100);
        //creating an array with demensions of figure
        double a = Math.random();
        Long randomlong = (long)Math.round(a * 1000000000) + 1111111;
        char[] arrch = Long.toString(randomlong).toCharArray();
        String v0 = Character.toString(arrch[0]) + Character.toString(arrch[1]);
        String v1 = Character.toString(arrch[2]) + Character.toString(arrch[3]);
        String v2 = Character.toString(arrch[4]) + Character.toString(arrch[5]);
        int[] finalInt = new int[3];
        finalInt[0] = Integer.valueOf(v0) + 1;
        finalInt[1] = Integer.valueOf(v1) + 1;
        finalInt[2] = Integer.valueOf(v2) + 1;
        //choosing the figure
        switch (random % 5) {
            case (0):
                // creating circle
                Circle circle = new Circle(ColorSupplier.getRandomColor());
                circle.setColour(ColorSupplier.getRandomColor());
                circle.setParams(finalInt);
                return circle;
            case (1):
                //creating isosceles trapezoid
                IsoscelesTrapezoid trapezoid =
                        new IsoscelesTrapezoid(ColorSupplier.getRandomColor());
                trapezoid.setParams(finalInt);
                trapezoid.setColour(ColorSupplier.getRandomColor());
                return trapezoid;

            case (2):
                //creating rectangle
                Rectangle rectangle = new Rectangle(ColorSupplier.getRandomColor());
                rectangle.setParams(finalInt);
                rectangle.setColour(ColorSupplier.getRandomColor());
                return rectangle;

            case (3):
                //creating right triangle
                RightTriangle rightTriangle = new RightTriangle(ColorSupplier.getRandomColor());
                rightTriangle.setParams(finalInt);
                rightTriangle.setColour(ColorSupplier.getRandomColor());
                return rightTriangle;

            default:
                //creating square
                Square square = new Square(ColorSupplier.getRandomColor());
                square.setParams(finalInt);
                square.setColour(ColorSupplier.getRandomColor());
                return square;

        }
    }
}
