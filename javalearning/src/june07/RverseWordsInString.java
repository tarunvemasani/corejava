package june07;

public class RverseWordsInString {
    public static void main(String[] args)
    {
        String s="Java J2EE Reverse Me";
        String out="";
        String[] sarray=s.split(" ");
        //for(int i=0;i<sarray.length;i++)
          //  System.out.println(sarray[i]);

        for(int i=0;i<sarray.length;i++){
            String sam=sarray[i];
            String rv="";
            for(int j=0;j<sam.length();j++)
            {
                char ch=sam.charAt(j);
                rv=ch+rv;
            }
            sarray[i]=rv;
        }
        out=String.join(" ",sarray);
        System.out.println(out);
    }
}
