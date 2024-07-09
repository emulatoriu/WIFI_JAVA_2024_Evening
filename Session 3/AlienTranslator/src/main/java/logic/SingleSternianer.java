package logic;

public class SingleSternianer implements Alientranslator{
    @Override
    public String translate(String text) {
        //Hallo -> H*a*l*l*o
        String[] textArray = text.split("");
        return String.join("*", textArray);
    }
}
