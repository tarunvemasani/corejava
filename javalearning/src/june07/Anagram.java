package june07;
import java.util.Arrays;



public class Anagram {
    public static void main(String[] args)
    {
        String s1="arc";
        String s2="cao";
        int count=0;
        if(s1.length()==s2.length())
        {
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();
            char[] sa1=s1.toCharArray();
            char[] sa2=s2.toCharArray();
            Arrays.sort(sa1);
            Arrays.sort(sa2);
            for(int i=0;i<sa1.length;i++)
            {
                if(sa1[i]!=sa2[i]) count++;
            }
            if(count==0)
                System.out.println("Given strings are anagram");
            else
                System.out.println("Given strings are not anagram");
        }

    }
}
