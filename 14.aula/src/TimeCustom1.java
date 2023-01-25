public class TimeCustom1 {
    private int segundosDoDia; // 0 - 86400

    public void setTime(int hour, int minute, int second) {

        segundosDoDia = hour*60*60 + minute*60 + second;

        }

    public String toUniversalString() {
        int hour = (segundosDoDia/60)/60;
        int sobramSegundos = segundosDoDia - hour * 60 * 60;
        int minute = sobramSegundos/60;
        int second = sobramSegundos - minute * 60;

         return String.format("%02d:%02d:%02d", hour, minute, second);
    }



    
         
}//chamadas ao dois métodos continuam iguais
        

