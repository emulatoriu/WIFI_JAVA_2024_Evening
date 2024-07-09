package logic;

public class DoubleSternianer implements Alientranslator{
    @Override
    public String translate(String text) {
        String[] textArray = text.split("");
        return String.join("**", textArray);
    }
}
