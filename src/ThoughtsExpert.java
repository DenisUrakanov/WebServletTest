public class ThoughtsExpert {
    public String getThoughts(String thoughts){
        if (thoughts.length()>8){
            return "You think a lot.";
        }else{
            return "You dont have enough ideas";
        }
    }
}
