package ex_07062024;

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "java is easy and java is powerful";
        String [] words= str.split(" ");
        HashMap<String , Integer> map= new HashMap<>();
        for (String word : words)
        {
            map.put(word, map.getOrDefault(word,0)+1);
        }
        System.out.println(map);
    }

}
