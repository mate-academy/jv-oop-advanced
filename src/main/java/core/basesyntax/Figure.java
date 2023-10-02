package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculation {
    private Color color;

     public Figure(Color color) {
        this.color = color;
    }
     public Figure(){

     }

    public Color getColor() {
        return color;
    }

    abstract public double getArea();

    abstract public void draw();
}


