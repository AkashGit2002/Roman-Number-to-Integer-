package src;
import java.util.Collections;
import java.util.HashMap;

public class Conveter {
    public static void main(String[] args) {
        int sum=0;
        String str="CMXVI";
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                sum=sum+map.get(str.charAt(i));
//                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
