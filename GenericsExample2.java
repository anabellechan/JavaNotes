import java.util.List;

public class GenericsExample {
    public static void main(String[] args){
        List<Integer> intList=new ArrayList<>();
        intList.add(3);
        printList(intList);

    }

    private static void printList(List<Object> myList ){
        System.out.println();
    }
}