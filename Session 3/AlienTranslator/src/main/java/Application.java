import logic.Alientranslator;
import logic.DoubleSternianer;
import logic.SingleSternianer;

public class Application {
    public static void main(String[] args) {
        Alientranslator single = new SingleSternianer();
        Alientranslator doubleS = new DoubleSternianer();

        System.out.println(single.translate("Hallo"));
        System.out.println(doubleS.translate("Hallo"));
    }
}
