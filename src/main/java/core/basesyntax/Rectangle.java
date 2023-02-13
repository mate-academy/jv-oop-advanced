package core.basesyntax;

public class Rectangle extends Square {
    private double secondSide;

    public Rectangle() {
        super();
        setName(FigureType.RECTANGLE);
        this.secondSide = 1;
    }

    public Rectangle(FigureType name, String color, double firstSide, double secondSide) {
        super(name, color, firstSide);
        setSecondSide(secondSide);
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = (secondSide >= 0) ? secondSide : 0;
    }

    @Override
    public double getArea() {
        return getSide() * secondSide;
    }

    @Override
    public String toDraw() {
        StringBuilder builder = new StringBuilder();
        return builder.append(super.toDraw()).append(", first side: ").append(getSide())
                .append(", second side: ").append(secondSide).append(", area: ")
                .append(getArea()).toString();
    }
}
