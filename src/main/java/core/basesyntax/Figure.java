package core.basesyntax;

public abstract class Figure implements Drawable, Area, Info {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        moreInfo();
        System.out.println("Area: " + getArea() + " sq. units");
        System.out.println("Color: " + color);
        System.out.println();
    }
}
