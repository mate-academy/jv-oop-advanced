package core.basesyntax.figures;

public class Rectangle extends Figure{
    private double upperSide;
    private double leftSide;
    public Rectangle(String color, double upperSide, double leftSide) {
        super(color);
        this.upperSide = upperSide;
        this.leftSide = leftSide;
        calcArea();
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Upper Side: " + roundDouble(upperSide) + " units");
        System.out.println("Left Side: " + roundDouble(leftSide) + " units");
    }

    @Override
    public void calcArea() {
        area = upperSide * leftSide;
    }
}
