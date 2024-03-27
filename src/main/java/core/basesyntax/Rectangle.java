package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculate, Drawable{
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color){
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void drawFigure() {
        System.out.println(("Figure: rectangle, first side: " + firstSide + ", second side: " + secondSide
                + ", area: " + getArea()
                + ", color: " + getColor()));
    }
}
