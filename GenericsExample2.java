import java.util.List;

public class GenericsExample {
    public static void main(String[] args){
        //Declare list that hold integer objects
        //new ArrayLiust<>() creates instance of arraylist that
        //will hold integer objects
        List<Integer> intList=new ArrayList<>();
        intList.add(3); //Adds integer 3 to the list
        printList(intList); //prints intlist, passing intlist as an argument

        List<Cat> catList = new ArrayList<> (); //Declarfes list
        //that hold Cat objects
        catList.add(new Cat()); //Adds new 'Cat' object to the list
        printList(catList);

    }

    private static void printList(List<? extends Animal> myList ){ //Method to take a list of anything
    //but you dont know what the list is going to be
        System.out.println();
    }
}

// public: keyword means class is accessible from other classes
// clasS: this keyword is used to define class in Java
//GenericExample: this is the name of the class

//static: method belongs to the class, not to any specific instance
//void means method does not return any value
//main: is the main entry of the program.
// string[] args: parameter that the mainmethod receives. It is an array 
// of string arguments passed from the command line.

