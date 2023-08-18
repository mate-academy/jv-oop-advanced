package core.basesyntax;

public abstract class Figure implements Parametrs{
    private String name;
    private double area;
    private String color;

    public Figure (String name, String color){
        this.name = name;
        this.color = color;
    }
    public abstract double getArea();

    public void calculateArea(){
        this.area = getArea();
    }
    public void getFigure() {
        System.out.println("---------------------------------");
        System.out.println("name: " + name);
        System.out.println("color: " + color);
        System.out.println("area: " + area);
        System.out.println("isFlat: " + isFlat());
        System.out.println("isSimple: " + isSimple());
    }


}
