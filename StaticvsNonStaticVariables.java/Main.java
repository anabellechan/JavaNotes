public class Main {
    public static void main(String[] args){
        System.out.println(Cat.getCatCount()); //Before Cat object has been created, catcount is 0
        Cat myCat= new Cat();
        myCat.meow();
        myCat.name="Stella";
        myCat.age=8;
        // System.out.println(Cat.MAX_LIVES);

        System.out.println(Cat.getCatCount()); //After Cat object has been created, catcount++
        myCat.meow();
    }
}
