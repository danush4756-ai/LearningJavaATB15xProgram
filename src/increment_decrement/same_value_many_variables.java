package increment_decrement;

public class same_value_many_variables {
    public static void main(String[] args) {
       int a,b,c,f;
       a=b=c=f=8;
       int d= ++a;
       int e= b++;
        System.out.println(a);
        System.out.println(d);
        System.out.println(b);
        System.out.println(e);
        System.out.println(c);
    /*here value of a and b has increased but
    it will not increase the value of c*/
        //here the words in next line is not considered as comment because // can be used only for single line
    }
}


