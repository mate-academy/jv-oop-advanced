package core.basesyntax;

public abstract class Shape {

    private String name;
    private String color;
    private StringBuilder sb = new StringBuilder();

    public Shape(String name) {
        this.name = name;
        this.color = randomColor();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public abstract double getPerimeter();

    public abstract void draw();

    public String info() {
        return sb.append("Shape: ").append(this.getName())
        .append(", color: " + this.getColor()).toString();
    }

    private String randomColor() {
        String color = "";
        String[] array = {"white","black","yellow","red","orange",
                          "pink","purple","grey","brown","golden",
                          "green","blue"};
        int rand = (int) (Math.random() * array.length);
        color += array[rand];
        return color;
    }
}



