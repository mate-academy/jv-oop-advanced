package core.basesyntax;

public class Circle extends Figure implements FigureDetails{
    private int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return this.radius;
    }


    @Override
    public void getArea() {
        System.out.println(Math.PI * radius * radius);
    }
    @Override
    public void getDetails() {
        System.out.println("circle tbd");
    }

}
