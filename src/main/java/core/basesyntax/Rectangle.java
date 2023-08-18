package core.basesyntax;

public class Rectangle extends Figure implements Parametrs{
    private double height;
    private double weight;

    public Rectangle(String name,String color,double height, double weight) {
        super(name, color);
        this.height = height;
        this.weight = weight;
        calculateArea();
    }
    public double getArea() {
        return height * weight;
    }


    @Override
    public boolean isFlat() {
        return true;
    }

    @Override
    public boolean isSimple() {
        return false;
    }
}
