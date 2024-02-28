package OOP_Test;

class SadMusic {
    public void listen() {
        System.out.println("I am listening sad music");
    }
}
class HappyMusic extends SadMusic{
    @Override
    public void listen() {
        System.out.println("I am listening happy music");
    }
}

public class Override_Method {
    public static void main(String[] args) {
        SadMusic sadMusic = new HappyMusic();
        sadMusic.listen();

        HappyMusic happyMusic = new HappyMusic();
        happyMusic.listen();
    }
}

/*
I am listening happy music
I am listening happy music
*/

