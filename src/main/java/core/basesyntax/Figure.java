package core.basesyntax;

public class Figure {
    private String nameFigure;
    private int sideA;
    private int sideB;
    private int height;
    private String colorFigure;
    private double areaFigure;

    public Figure() {

    }

    public Figure(int sideA) {
        this.sideA = sideA;
    }

    public Figure(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Figure(int sideA, int sideB, int weight) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = weight;
    }

    public Figure(String nameFigure, double areaFigure, int sideA, int sideB, String colorFigure) {
        this.nameFigure = nameFigure;
        this.areaFigure = areaFigure;
        this.sideA = sideA;
        this.sideB = sideB;
        this.colorFigure = colorFigure;
    }

    public Figure(String nameFigure, double areaFigure, int sideA,
                  int sideB, int height,String colorFigure) {
        this.nameFigure = nameFigure;
        this.areaFigure = areaFigure;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.colorFigure = colorFigure;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHeight() {
        return height;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public void setAreaFigure(double areaFigure) {
        this.areaFigure = areaFigure;
    }

    public void setColorFigure(String colorFigure) {
        this.colorFigure = colorFigure;
    }

    @Override
    public String toString() {
        if (nameFigure.equals("circle")) {
            return "Figure"
                    + ": " + nameFigure
                    + ", area: " + areaFigure + " sq.units"
                    + ", radius: " + sideA + " units"
                    + ", color: " + colorFigure;
        }

        if (nameFigure.equals("right_triangle") || nameFigure.equals("square")) {
            return "Figure"
                    + ": right triangle"
                    + ", leg: " + areaFigure + " sq.units"
                    + ", side: " + sideA + " units"
                    + ", color: " + colorFigure;
        }
        if (nameFigure.equals("rectangle")) {
            return "Figure"
                    + ": " + nameFigure
                    + ", area: " + areaFigure + " sq.units"
                    + ", firstLeg: " + sideA + " units"
                    + ", secondLeg: " + sideB + " units"
                    + ", color: " + colorFigure;
        }
        return "Figure"
                + ": isosceles trapezoid"
                + ", area: " + areaFigure + " sq.units"
                + ", upper base: " + sideA + " units"
                + ", lower base: " + sideB + " units"
                + ", height: " + height + " units"
                + ", color: " + colorFigure;
    }
}
