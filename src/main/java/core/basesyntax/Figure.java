package core.basesyntax;

public abstract class Figure implements DrawingArea {
    private String color;
    private String typeOfFigure;
    private int area;

    public Figure(String color, String typeOfFigure) {
        this.color = color;
        this.typeOfFigure = typeOfFigure;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeOfFigure() {
        return typeOfFigure;
    }

    public void setTypeOfFigure(String typeOfFigure) {
        this.typeOfFigure = typeOfFigure;
    }

    public static int calculateArea(Figure[] figures) {
        int totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.getArea();
        }
        return totalArea;
    }

    @Override
    public String draw() {
        return "Fugure: " + getTypeOfFigure() + ", color: "
                + getColor() + ", area: "
                + getArea() + " sq. units";
    }
}
