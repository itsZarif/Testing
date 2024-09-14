package Abstruction;

public abstract class MobileUser {
    abstract void  sendMessage();
    void call()
    {
        System.out.println("Calling Non-Abstract Method");
    }
}
