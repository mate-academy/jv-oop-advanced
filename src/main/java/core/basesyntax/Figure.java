package core.basesyntax;

public abstract class  Figure {

    private String color;
    private String Name;

    public void setColor(String color) {
        this.color =  color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setRandomProperties() {

    }

    public void draw() {
        //System.out.println(this.getName()+", area: " +this.obtainArea()+ " sq.units, color "+ this.getColor());
    }
}
