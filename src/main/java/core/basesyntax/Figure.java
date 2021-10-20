package core.basesyntax;

public class Figure {
    private float area = 0;
    private String color = null;

    public Figure() {
    }

    Figure(float area, Colors color){
        this.area = area;
        this.color = color.toString();
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setColor(Colors color) {
        this.color = color.toString();
    }

    public float getArea() {
        if(area == 0) {
            System.out.println("unknown figure");
        }
        return area;
    }

    public String getColor() {
        if(color == null) {
            System.out.println();
            return "unknown color";
        }
        return color;
    }
    @Override
    public String toString() {
        return "Figure" + "have area=" + area + ", color=" + color;
    }
}
