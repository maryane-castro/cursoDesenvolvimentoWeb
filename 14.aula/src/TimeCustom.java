/*Dar UPDATE DE TRATAMENTO DE ERRO */


public class TimeCustom {
    private int hour; 
    private int minute;
    private int second; 


    public TimeCustom() {
        this(0, 0, 0); // invoke constructor with three arguments
    }


    public TimeCustom(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }


    public TimeCustom(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }


    public TimeCustom(int hour, int minute, int second) { //fiz tratamento de erro
        if (hour >= 0 && hour <= 23){
            this.hour = hour;
        }
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        }
        if (second >= 0 && second <= 59){
            this.second = second;
        }
    }



    public TimeCustom(TimeCustom time) {
        this(time.hour, time.minute, time.second);
    }



    public void mostraTempo(){
        System.out.printf("Hora armazenada: %d:%d:%d %n", hour, minute, second);
    }

    public void setHora(int hour){
        this.hour = hour;
    }

}
