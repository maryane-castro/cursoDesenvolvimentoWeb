public class Data {
    private int month; // 1-12
     private int day; // 1-31 based on month
     private int year; // any year
     private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
     
    public Data(int month, int day, int year) { //colocar
        this.month = month;
        this.day = day;
        this.year = year;
        System.out.printf("Date object constructor for date %s%n", this);

     
     }


    public void setData(int day, int month, int year){ //pegar
        this.month = month;
        this.day = day;
        this.year = year;
    }



    public String toString() {          //toString para retornar em outra class
        return String.format("%d/%d/%d", month, day, year);
     }

     
}
    