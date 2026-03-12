package core.basesyntax;

abstract public class Figure implements Drawable {
    private String color;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    abstract public double area();
    abstract public String getSpecificProperties();


    @Override
    public void draw() {
        if(color != null){
            System.out.println("Figure: " + this.getClass().getSimpleName()
                    + ", area: " + area() + " " + getSpecificProperties() + " sq.units, color: " + color);
        } else {
            System.out.println("Color is null");
        }
    }
}
