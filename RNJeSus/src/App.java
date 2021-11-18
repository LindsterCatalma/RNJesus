import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {

        // place number of bets to be generated
        int bets = 10;
        for(int x = 0 ; x < bets ; x++){
            Set<Integer> lotto = new HashSet<>();

            while(lotto.size() < 6){
                lotto.add(random58());
            }
            System.out.println(lotto.toString());
        }
    }

    private static int random58(){
        Random random = new Random();
        return random.ints(1, 59).findFirst().getAsInt();
    }
}
