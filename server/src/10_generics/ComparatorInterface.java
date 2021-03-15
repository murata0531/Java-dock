import java.util.*;

class Employee {

    private String name;
    private Integer id;

    public Employee(String name,Integer id){
        this.name = name;
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}

class MyRule implement Comparator<Employee> {
    public int compare(Employee e1,Employee e2){
        return e1.getId().comareTo(e2.getId());
    }
}

public class ComparatorInterface {
    public static void main(String[] args){

    }
}