package core.basesyntax;

public class Square extends Figure {
    private int sideSquare = 20;
    private String color = Colors.YELLOW.name();

    public double getArea() {
        area = sideSquare * sideSquare;
        return area;
    }

    public void paintFigure() {
        System.out.println("Figure : sqaure, area : " + getArea() + ", side : "
                + sideSquare + ", color : " + color);
    }

    public void setSideSquare(int sideSquare) {
        this.sideSquare = sideSquare;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
