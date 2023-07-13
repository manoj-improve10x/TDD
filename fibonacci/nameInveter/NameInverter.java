package fibonacci.nameInveter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameInverter {
    public String inverterName(String name) {
        if (name.equals("")) {
            return "";
        } else if (!name.trim().contains(" ")) {
            return name.trim();
        } else {
            ArrayList<String> names = new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
            removeHonorifics(names);
            String postNominal = formatMultiElementName(names.subList(2, names.size()));
            return (names.get(1) + ", " + names.get(0) + " " + postNominal).trim();
        }
    }

    private static String formatMultiElementName(List<String> postNominalsList) {
        String postNominal = "";
        for (int i = 0; i < postNominalsList.size(); i++) {
            postNominal += postNominalsList.get(i) + " ";
        }
        return postNominal;
    }

    private static void removeHonorifics(ArrayList<String> names) {
        if (names.get(0).matches("Mrs.|Mr.|Miss.") && names.size() > 2) {
            names.remove(0);
        }
    }
}
