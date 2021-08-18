package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: Rectangle, area: ")
                        .append(getArea())
                        .append(" sq.units, firstSide: ")
                        .append(firstSide)
                        .append(" sq.units, secondSide: ")
                        .append(secondSide)
                        .append(" units, color: ")
                        .append(getColor())
        );
    }
}
