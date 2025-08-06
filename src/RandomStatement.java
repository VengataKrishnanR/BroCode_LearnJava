
import java.util.Random;


public class RandomStatement {
    public static void main(String[] arg){

        Random random = new Random();

        int number;
        number = random.nextInt(10);

        System.out.println(number);
    }
}
