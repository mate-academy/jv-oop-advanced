package core.basesyntax;

public class Figure implements PrintableInfo, SetableArea {
    private String name;
    private String color;

    private double area;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printInfoAboutFigures() {
        System.out.println("Figure: " + name + ", " + "color: " + color
                + ", " + "area: " + area + " square units, ");
    }

    public void setArea(double area) {
        this.area = area;
    }
}
