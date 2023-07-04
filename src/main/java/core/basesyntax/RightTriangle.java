package core.basesyntax;

public class RightTriangle extends Rectangle {
    public RightTriangle() {
    }

    public RightTriangle(String color, int firstSide, int secondSide) {
        super(color,
                firstSide, secondSide,
                Math.sqrt(firstSide * firstSide + secondSide * secondSide));
    }

    @Override
    public double getArea() {
        return firstSide * secondSide / 2;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: right triangle, area: ")
                .append(getArea()).append(" sq.units, first leg: ")
                .append(firstSide).append(" units, second leg: ")
                .append(secondSide).append(" units, hypotenuse: ")
                .append(thirdSide).append(" units, color: ")
                .append(getColor());
        System.out.println(info);
    }
}
