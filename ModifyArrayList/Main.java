package ModifyArrayList;

public class Main {
    public static void main(String[] args) {
        ModArrayList listy = new ModArrayList<>();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);
        listy.add(40);
        listy.getUsingMod(0);
        listy.getUsingMod(-2);        
        listy.getUsingMod(40);


    }
    
}
