import java.util.Map;
import java.util.TreeMap;

public class PrintUnique {
    public static void main(String[] args) {
        String s1="swiss";
        Map<Character,Integer> m1=new TreeMap<>();

        for(char c :s1.toCharArray()){
           m1.put(c,m1.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> e:m1.entrySet()){
            if(e.getValue()==1)
            System.out.println(e.getKey());
        }

    }

}
