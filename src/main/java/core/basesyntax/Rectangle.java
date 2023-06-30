package core.basesyntax;

public class Rectangle extends Figure {
    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;

    public Rectangle() {
    }

    public Rectangle(String color, double firstSide, double secondSide, double thirdSide) {
        this.setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double getArea() {
        double halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(
                halfPerimeter
                * (halfPerimeter - firstSide)
                * (halfPerimeter - secondSide)
                * (halfPerimeter * thirdSide));
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: triangle, area: ")
                .append(getArea()).append(" sq.units, first side: ")
                .append(firstSide).append(" units, second side: ")
                .append(secondSide).append(" units, third side: ")
                .append(thirdSide).append(" units, color: ")
                .append(getColor());
        System.out.println(info);
    }

    @Override
    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        double firstSide = figureSupplier.getRandomSideLength();
        double secondSide = figureSupplier.getRandomSideLength();
        double thirdSide = figureSupplier.getRandomSideLength();
        return new IsoscelesTrapezoid(color, firstSide, secondSide, thirdSide);
    }
}
