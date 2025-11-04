package Pendu;

import java.util.*;

public class PenduGame {
	static String[] mystterywordlist = {"test", "python", "java","spring"};
    static int len = mystterywordlist.length;
    static Map<String, Integer> result = new HashMap<>();
    static ArrayList<Map<String, List<Integer>>> listOfMaps = new ArrayList<>();
    
    // Stockez les valeurs si elles sont dans le mot mystere (lettre , position)
    static void storeInArray(String letter, String mysteryWord) {
        Map<String, List<Integer>> indexlist = new HashMap<>();
        List<Integer> positions = new ArrayList<>();
        
        for (int i = 0; i < mysteryWord.length(); i++) {
            if (mysteryWord.charAt(i) == letter.charAt(0)) {
                positions.add(i * 2);
            }
        }
        
        System.out.println();
        if (!positions.isEmpty()) {
            System.out.println("Bien joué, la lettre '" + letter + "' est dans le mot");
        }
        
        indexlist.put(letter, positions);
        listOfMaps.add(indexlist);
    }
    
    // Genere un nombre aleatoire
	static int generateRand() {
	    Random rand = new Random();
	    int n = rand.nextInt(len);        
	    return n;
	}
	
	// Vérifie si le jeu est fini ou pas et print le nbr de test restant
	public static boolean isFinish(String mystery, int nbrtest) {
		if(!mystery.contains("_")) {
			System.out.println();
			System.out.println("Vous avez gagnez en " + nbrtest + " coup");
			System.out.println();
			return true;
		} else {
			return false;
		}
	}
	
	// Generer un print de l'etat d'avancement du jeu en cours
	static String genratePenduPrint(String word) {
		StringBuilder strbuilder;
		
		String test = "";
		for (int i = 0; i < word.length(); i++) {
			test += "_ ";
		}
		strbuilder = new StringBuilder(test);
		
		listOfMaps.forEach(m -> m.forEach((k, v) -> {
		    for (Integer position : v) {
		        strbuilder.setCharAt(position, k.charAt(0));
		    }
		}));
		System.out.println();
		System.out.println("Mot mystère : " + strbuilder);
		return strbuilder.toString();		
	}
	
	public static void main(String[] args) {
		int nbr = generateRand();
		String mysteryWord = mystterywordlist[nbr];
		genratePenduPrint(mysteryWord);
		boolean finish = false;

		int nbrtest = 0;
		int nbrDeCoupTotal = 10;	
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.print("choisir une lettre : ");
			String letter = scan.next();
			storeInArray(letter,mysteryWord);
			nbrtest++;
			finish = isFinish(genratePenduPrint(mysteryWord), nbrtest);
			System.out.println();
			System.out.println("Il vous reste " + (nbrDeCoupTotal - nbrtest) + " coup");
			if(nbrtest == nbrDeCoupTotal) {
				finish = true;
			}
		} while(!finish);
		
	}
}
