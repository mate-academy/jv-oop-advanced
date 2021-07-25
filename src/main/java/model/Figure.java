package model;

public abstract class Figure {
    private String color;
    private String figureName;

    public Figure(String color) {
    }

    public String getColor() {
        return color;
    }

    public void setColour(String colour) {
        this.color = colour;
    }

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figuretype) {
        this.figureName = figuretype;
    }

    public void drow() {
        System.out.println("Info about figure");
    }

    public abstract double getArea();

    public void setParams(int[] params) {

    }
}
