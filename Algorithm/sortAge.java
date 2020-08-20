import java.util.*;
public class sortAge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> list = new ArrayList<Person>();
        
        for (int i=0;i<n;i++) {
            list.add(new Person(sc.nextInt(), sc.next()));
        }
        sc.close();
        
        Collections.sort(list);
        for (int i=0;i<n;i++) {
            Person p = list.get(i);
            System.out.println(p.getAge()+ " " +p.getName());
        }
    }
}

class Person implements Comparable<Person> {
    private int age;
    private String name;
    public Person (int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(Person p) {
        if (this.age<p.age) {
            return -1;
        }
        else if (this.age>p.age) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
