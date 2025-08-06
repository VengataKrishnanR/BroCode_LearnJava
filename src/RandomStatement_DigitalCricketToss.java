
import java.util.Random;

public class RandomStatement_DigitalCricketToss {
    public static void main(String[] arg){

        Random random = new Random();

        boolean isHead;

        isHead = random.nextBoolean();

        if(isHead){
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
