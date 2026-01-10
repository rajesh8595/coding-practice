import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void countCharacters(String s){
        Map<Character,Integer>map=new HashMap<>();
        char[]ch=s.toCharArray();
        for(char c1 : ch){
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1)+1);
            }else{
                map.put(c1,1);
            }
        }
        //Print only unique characters
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        String s1="swiiss";
        countCharacters(s1);
    }
}
