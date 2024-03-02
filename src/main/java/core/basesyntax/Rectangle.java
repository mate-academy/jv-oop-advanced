package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSideRectangle = 15;
    private int secondSideRectangle = 25;
    private String color = Colors.BLUE.name();

    public double getArea() {
        area = firstSideRectangle * secondSideRectangle;
        return area;
    }

    @Override
    public void paintFigure() {
        System.out.println("Figure : Rectangle, area : " + getArea()
                + ", sideRectangle1 : " + firstSideRectangle
                + ", sideRectangle2 : " + secondSideRectangle + ", color : " + color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFirstSideRectangle(int firstSideRectangle) {
        this.firstSideRectangle = firstSideRectangle;
    }

    public void setSecondSideRectangle(int secondSideRectangle) {
        this.secondSideRectangle = secondSideRectangle;
    }
}
