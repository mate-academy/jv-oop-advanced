package core.basesyntax.figure;

public class Rectangle extends Figure {

    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void getPrint() {
        System.out.println("Figura: Prostokąt " + "Pole: " + (firstSide * secondSide)
                + " Kolor: " + getColor());
    }
}
