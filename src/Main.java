import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Student> a = new TreeMap<>(new OrderByNoteComparator());
        a.put(1,new Student(100,"Yahya",1));
        a.put(3,new Student(100,"Resul",3));
        a.put(2,new Student(100,"Reco",2));
        for (Student i:a.values()){
            System.out.println(i.getStuName());
        }

    }
}