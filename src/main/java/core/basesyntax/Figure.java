package core.basesyntax;
public abstract class Figure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public void draw(){
        System.out.println(this.getClass().getSimpleName() + ", area: " + calculateArea() + "sq. units, color: " + color);
    }
    public String getColor() {
        return color;
    }
}
