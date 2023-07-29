package core.basesyntax;

public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle(String color,int sideA,int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int figureArea() {
        return sideA * sideB;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + figureArea() + " sq. units, length: "
                + sideA + " units, width: " + sideB + " units, color: " + color);
    }
}
