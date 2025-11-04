package Celebrite;

import java.util.*;

public class Data {
    public static LinkedHashMap<String, ArrayList<Integer>> partylist = new LinkedHashMap<>();

    static {
        ArrayList<Integer> albert = new ArrayList<>();
        albert.add(2);
        albert.add(5);
        albert.add(6);
        partylist.put("Albert", albert);

        ArrayList<Integer> benedicte = new ArrayList<>();
        benedicte.add(3);
        benedicte.add(5);
        benedicte.add(6);
        partylist.put("Bénédicte", benedicte);

        ArrayList<Integer> christophe = new ArrayList<>();
        christophe.add(2);
        christophe.add(4);
        christophe.add(5);
        christophe.add(6);
        partylist.put("Christophe", christophe);

        ArrayList<Integer> delphine = new ArrayList<>();
        delphine.add(1);
        delphine.add(2);
        delphine.add(5);
        delphine.add(6);
        delphine.add(8);
        partylist.put("Delphine", delphine);

        ArrayList<Integer> edouard = new ArrayList<>();
        edouard.add(6);
        partylist.put("Edouard", edouard);

        ArrayList<Integer> francoise = new ArrayList<>();
        francoise.add(5);
        partylist.put("Françoise", francoise);

        ArrayList<Integer> gaston = new ArrayList<>();
        gaston.add(2);
        gaston.add(3);
        gaston.add(5);
        gaston.add(6);
        gaston.add(8);
        partylist.put("Gaston", gaston);

        ArrayList<Integer> heloise = new ArrayList<>();
        heloise.add(2);
        heloise.add(4);
        heloise.add(5);
        heloise.add(6);
        heloise.add(7);
        partylist.put("Heloïse", heloise);
    }
}
