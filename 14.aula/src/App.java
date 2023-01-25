
public class App {
    public static void main(String[] args) {

        TimeCustom t1 = new TimeCustom(); 
        TimeCustom t2 = new TimeCustom(2);
        TimeCustom t3 = new TimeCustom(21, 34);
        TimeCustom t4 = new TimeCustom(12, 25, 42);
        TimeCustom t5 = new TimeCustom(t4);

        t1.mostraTempo();
        t2.mostraTempo();
        t3.mostraTempo();
        t4.mostraTempo();
        t5.mostraTempo();


        t5.mostraTempo();

    }
}
