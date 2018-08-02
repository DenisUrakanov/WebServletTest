import java.util.ArrayList;
import java.util.List;

public class FootballExpert  {
    public List makeChoice(String player){
        List players = new ArrayList();
        if (player.equals("Russia")) {
            players.add("Akinfeev");
            players.add("Ignashevich");
        }
        else {
            players.add("Modrich");
            players.add("Messi");
            players.add("Ronaldo");
        }

        return players;
    }
}
