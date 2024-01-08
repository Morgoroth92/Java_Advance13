import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        Cibi cibo1 = new Cibi("pizza", "cibo");
        Cibi cibo2 = new Cibi("patatine", "cibo");
        Cibi bibita1 = new Cibi("coca cola", "bibita");
        Cibi bibita2 = new Cibi("caffè", "bibita");


        HashMap<String, String> mappa1 = new HashMap<String, String>();
        mappa1.put("1", "caffè");
        mappa1.put("2", "coca cola");
        mappa1.put("3", "pizza");
        mappa1.put("4", "patatine");
        System.out.println(mappa1);

        Map<String, String> mappa2 = Map.of("1", "caffè", "2", "coca cola", "3", "pizza", "4", "patatine");
        System.out.println(mappa2);

        Map<String, String> mappa3 = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("1", "caffè"),
            new AbstractMap.SimpleEntry<>("2", "coca cola"),
            new AbstractMap.SimpleEntry<>("3", "pizza"),
            new AbstractMap.SimpleEntry<>("4", "patatine")
        );
        System.out.println(mappa3);
    }


}
