package core.basesyntax;

public class Rectangle extends Figure {

    private final double firstSide;
    private final double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double GetArea() {
        return firstSide * secondSide;
    }

    @Override
    public void GetPrint() {
        System.out.println("Figura: Prostokąt " + "Pole: " + (firstSide * secondSide) + " Kolor: " + getColor());
    }
}
