import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args){

        String[] ary = {"CCCC","AAA","BBB"};
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add(ary[0]);
        treeSet.add(ary[1]);
        treeSet.add(ary[2]);
        treeSet.add(ary[0]);

        System.out.println("TreeSet size : " + treeSet.size());

        for(String s : treeSet){{
            System.out.print(s + " ");
        }

        System.out.println();
        
        }
    }
}