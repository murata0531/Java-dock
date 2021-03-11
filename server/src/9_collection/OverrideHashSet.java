import java.util.*;

class Foo {
    private String str;

    public Foo(String str){
        this.str = str;
    }

    public String toString(){
        return str + " ";
    }

    public int hashCode(){
        return str.hashCode();
    }

    public boolean equals(Object obj){
        this.hashCode() == obj.hashCode();
    }
}

public class OverrideHashSet {
    public static void main(String[] args){

        String[] ary = {"CCCC","AAA","BBB"};
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(ary[0]);
        hashSet.add(ary[1]);
        hashSet.add(ary[2]);
        hashSet.add(ary[0]);

        System.out.println("HashSet size : " + hashSet.size());

        for(String s : hashSet){{
            System.out.print(s + " ");
        }

        System.out.println();

        }
    }
}