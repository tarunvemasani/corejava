package june07;

import java.util.ArrayList;

public class Noofvowelsinstring {
    public static void main(String[] args)
    {
        String s="hello world";
        ArrayList<Character> vow=new ArrayList<Character>(5);
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');

        s=s.toLowerCase();
        int count=0;
        for (int i=0;i<s.length();i++)
        {
            //if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') count++;
            if(vow.contains(s.charAt(i))) count++;
        }
        System.out.println(count);
    }

}
