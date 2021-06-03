package core.basesyntax;



public class Rectangle extends Figure  {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        areaCalculate();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, color: " + getColor());
    }
    public void areaCalculate() {

        setArea(firstSide * secondSide);
    }

}
