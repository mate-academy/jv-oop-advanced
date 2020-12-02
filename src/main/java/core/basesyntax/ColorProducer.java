package core.basesyntax;

public class ColorProducer {

    public String randomColor() {
        String color = "";
        String[] array = {"white","black","yellow","red","orange",
                "pink","purple","grey","brown","golden",
                "green","blue"};
        int rand = (int) (Math.random() * array.length);
        color += array[rand];
        return color;
    }

}
