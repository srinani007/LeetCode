package Stack.ReverseString;

public class Reverse {
    public void reverseString(char[] s){
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    } 
    public static void main(String[] args) {
        Reverse r=new Reverse();
        char[] s={'h','e','l','l','o'};
        r.reverseString(s);
        System.out.println(s);
    }
}
