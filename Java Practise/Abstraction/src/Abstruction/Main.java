package Abstruction;

public class Main {
    public static void main(String[] args) {
        MobileUser mu;
        mu = new Adham();
        mu.sendMessage();
        mu.call();

        mu = new ZArif();
        mu.sendMessage();
        mu.call();
    }
}