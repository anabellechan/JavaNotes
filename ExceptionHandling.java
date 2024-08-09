class ExceptionHandling {
    public static void main(String[] args){
        try{
           getInt();
        }
        catch(NumberFormatException | NullPointerException e) {
            System.out.println("Unable to make integer out of that input.");
    }   
        finally {
            System.out.println("In the finally block");
        }
    System.out.println("End here");
}
    private static void getInt() {
        int myInt=Integer.parseInt("abc");
    }
}