package AppGamingBasic;

public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Crouch");
    }

    public void left(){
        System.out.println("Moving Left");
    }

    public void right(){
        System.out.println("Moving Right");
    }
}
