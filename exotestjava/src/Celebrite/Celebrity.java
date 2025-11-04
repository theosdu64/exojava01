package Celebrite;

import java.util.*;

public class Celebrity {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> numberlist = new ArrayList(); 
		ArrayList<String> nameList = new ArrayList();
		
		
		// Rassemblez tout les numéros des participants et récupérez leur nom dans 2 list differente
		for (String name : Data.partylist.keySet()) {
			nameList.add(name);
			for (Integer num : Data.partylist.get(name)) {
				numberlist.add(num);
			}
		}

        Map<Integer, Integer> scores = new HashMap<>();
		// Groupez tout les numéro de la numberlist et couté leur iteration
        for (int num : numberlist) {
        	Integer count = scores.get(num);
        	
        	if(count == null) {
        		scores.put(num, 1);
        	} else {
        		scores.put(num, count + 1);
        	}
        	
		}
        
		System.out.println("____________________ScoreList_________________________");
		System.out.println();
		System.out.println(scores);
		System.out.println();
		System.out.println("____________________ScoreAndNameList_________________________");


		// Generer une map avec index des participant + le nombre de fois que leur numéro apparait dans numberlist
		Map<String, Integer> scoreAndNameList = new HashMap<>();
		
		for (int i = 0; i < nameList.size(); i++) {
		    scoreAndNameList.put(nameList.get(i), scores.get(i + 1));
		}
		System.out.println();
		System.out.println(scoreAndNameList);
		
		System.out.println();
		System.out.println("____________________Find Celebrity_________________________");
		System.out.println();

		// hashmap qui affiche le nom des particpant qui sont des celebrités
		 for (Map.Entry<String, Integer> entry : scoreAndNameList.entrySet()) {

	            if(entry.getValue() == scoreAndNameList.size() - 1) {
	            	System.out.println(entry.getKey() + " est une celebrité");
	            }
	        }

	}
}
