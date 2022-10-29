public class Main {

    public static void main(String[] args) {
        MarbleJar myJar = new MarbleJar(40);
        myJar.openLid();
        myJar.putMarble(5);
        myJar.putMarble(30);

        myJar.closeLid();
        myJar.takeMarble(3);
    }
}