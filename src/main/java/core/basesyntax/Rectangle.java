package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSideRectangle;
    private int secondSideRectangle;
    private String color;

    public Rectangle(String color, int firstSideRectangle, int secondSideRectangle) {
        this.color = color;
        this.firstSideRectangle = firstSideRectangle;
        this.secondSideRectangle = secondSideRectangle;
    }

    public double getArea() {
        double area = firstSideRectangle * secondSideRectangle;
        this.setArea(area);
        return area;
    }

    @Override
    public void paintFigure() {
        System.out.println("Figure : Rectangle, area : " + getArea()
                + ", sideRectangle1 : " + firstSideRectangle
                + ", sideRectangle2 : " + secondSideRectangle + ", color : " + color);
    }
}
