import java.util.*;
public class sortWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> stringArray = new ArrayList<String>();
        ArrayList<Strings> sortedArray = new ArrayList<Strings>();
        
        for (int i=0;i<n;i++) {
            String s = sc.next();
            if (!stringArray.contains(s))
            	stringArray.add(s);
        }
        sc.close();
        
        for (int i=0;i<stringArray.size();i++) {
        	sortedArray.add(new Strings(stringArray.get(i)));
        }
        Collections.sort(sortedArray);
        
        for (int i=0;i<sortedArray.size();i++) {
            System.out.println(sortedArray.get(i).getString());
        }
    }
}

class Strings implements Comparable<Strings> {
    private String s;
    public Strings(String s) {
        this.s = s;
    }
    
    public String getString() {
        return s;
    }
    
    @Override
    public int compareTo(Strings string) {
        if (this.s.length() < string.s.length()) {
            return -1;
        }
        else if (this.s.length() > string.s.length()) {
            return 1;
        }
        else {
            if (this.s.compareTo(string.s)>0)
                return 1;
            else if (this.s.compareTo(string.s)<0)
                return -1;
            else
                return 0;
        }
    }
}
