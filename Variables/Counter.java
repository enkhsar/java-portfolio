public class Counter {

    static int count = 0;
    int instanceCount = 0;
    
public void increment () {

    count++;   
    instanceCount++;

}

public static void main (String[] args) {
    Counter c1 = new Counter ();
    Counter c2 = new Counter ();

    c1.increment();
    c2.increment();
    System.out.println(count);

    }
}