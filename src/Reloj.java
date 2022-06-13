public class Reloj {
    int horas;
    int minutos;
    int segundos;
    //Constructores
    public Reloj(){
        horas = 12;
        minutos = 0;
        segundos = 0;
    }
    public Reloj(int horas, int minutos, int segundos){
        if (horas>23 || minutos>59 || segundos>59){
            System.out.println("Supera los parámetros");
        }else {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }
    public Reloj(int tiempoSegundos){
        if(tiempoSegundos>86400){
            System.out.println("Supera los parámetros");
        }else {
            horas = tiempoSegundos / 3600;
            tiempoSegundos = tiempoSegundos - (horas * 3600);
            minutos = tiempoSegundos / 60;
            tiempoSegundos = tiempoSegundos - (minutos * 60);
            segundos = tiempoSegundos;
        }
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    //Métodos
    public void setReloj(int tiempoSegundos){
        if(tiempoSegundos>86400){
            System.out.println("Supera los parámetros");
        }else {
            horas = tiempoSegundos / 3600;
            tiempoSegundos = tiempoSegundos - (horas * 3600);
            minutos = tiempoSegundos / 60;
            tiempoSegundos = tiempoSegundos - (minutos * 60);
            segundos = tiempoSegundos;
        }
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void setHoras(int horas) {
        if(horas>24){
            System.out.println("Fuera de rango");
        }else {
            this.horas = horas;
        }
    }

    public void setMinutos(int minutos) {
        if(minutos>59){
            System.out.println("Fuera de rango");
        }else {
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos>59){
            System.out.println("Fuera de rango");
        }else {
            this.segundos = segundos;
        }
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void tick(){
        int segundos;
        segundos = this.segundos;
        segundos++;
        if(segundos>59){
            segundos=0;
        }
        this.segundos=segundos;
    }

    public void tickDecrement(){
        int segundos;
        segundos = this.segundos;
        segundos--;
        if(segundos<0){
            segundos=59;
        }
        this.segundos=segundos;
    }
    public String toSg() {
        int horas = this.horas;
        int minutos = this.minutos;
        int segundos = this.segundos;
        String h;
        String m;
        String s;
        if (horas < 10) {
            h = String.valueOf(horas);
            h = "0" + h;
        } else {
            h = String.valueOf(horas);
        }
        if (minutos < 10) {
            m = String.valueOf(minutos);
            m = "0" + m;
        } else {
            m = String.valueOf(minutos);
        }
        if (segundos < 10) {
            s = String.valueOf(segundos);
            s = "0" + s;
        } else {
            s = String.valueOf(segundos);
        }
        return ("[" + h + ":" + m + ":" + s + "]");
    }
    public void addReloj(Reloj R){
        this.horas = R.horas;
        this.minutos = R.minutos;
        this.segundos = R.segundos;
    }
    public String restaReloj(Reloj R){
        int tiempoSegundos = (this.horas * 3600) + (this.minutos * 60) + (this.segundos);
        int tiempoSegundoR = (R.horas*3600) + (R.segundos*60) + (R.segundos);
        int abs = Math.abs(tiempoSegundoR-tiempoSegundos);
        int horas = abs / 3600;
        abs = abs - (horas * 3600);
        int minutos = abs / 60;
        abs = abs - (minutos * 60);
        int segundos = abs;
        String h;
        String m;
        String s;
        if (horas < 10) {
            h = String.valueOf(horas);
            h = "0" + h;
        } else {
            h = String.valueOf(horas);
        }
        if (minutos < 10) {
            m = String.valueOf(minutos);
            m = "0" + m;
        } else {
            m = String.valueOf(minutos);
        }
        if (segundos < 10) {
            s = String.valueOf(segundos);
            s = "0" + s;
        } else {
            s = String.valueOf(segundos);
        }
        return ("[" + h + ":" + m + ":" + s + "]");
    }
}

