package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private double firstSide;
    private double secondSide;

    public Rectangle() {
        super();
        setName(FigureType.RECTANGLE);
        this.firstSide = 1;
        this.secondSide = 1;
    }

    public Rectangle(FigureType name, String color, double firstSide, double secondSide) {
        super(name, color);
        setFirstSide(firstSide);
        setSecondSide(secondSide);
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = (firstSide >= 0) ? firstSide : 0;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = (secondSide >= 0) ? secondSide : 0;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String toDraw() {
        StringBuilder builder = new StringBuilder();
        return builder.append(super.toDraw()).append(", first side: ").append(firstSide)
                .append(", second side: ").append(secondSide).append(", area: ")
                .append(getArea()).toString();
    }
}
