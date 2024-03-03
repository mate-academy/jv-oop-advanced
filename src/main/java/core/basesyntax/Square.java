package core.basesyntax;

public class Square extends Figure {
    private int sideSquare;
    private String color;

    public Square(String color, int sideSquare) {
        this.color = color;
        this.sideSquare = sideSquare;
    }

    public double getArea() {
        double area = sideSquare * sideSquare;
        this.setArea(area);
        return area;
    }

    public void paintFigure() {
        System.out.println("Figure : sqaure, area : " + getArea() + ", side : "
                + sideSquare + ", color : " + color);
    }
}
