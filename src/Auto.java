public class Auto {
    private String sPlaca;
    private double dVelocidadMaxima=180;
    private boolean bEncendidoMotor= false;
    private boolean bMovimiento= false;
    private boolean bLucesEncendidas= false;
    private double dDistanciaFrenado=10;
    private double dVelocidadActual=0;
    private double dAceleracion=15;

    public Auto(){

    }
    public void encenderMotor(){
        bEncendidoMotor=true;

    }
    public void apagarMotor(){
        bEncendidoMotor=false;

    }
    public void avanzar(){
        if(bEncendidoMotor){
            dVelocidadActual=dVelocidadActual + 15;
        }
        System.out.println("Avance - velocidad= "+dVelocidadActual);
    }

    public void frenar(){
        if(bEncendidoMotor){
            if(dVelocidadActual >=dDistanciaFrenado)
            dVelocidadActual=dVelocidadActual - dDistanciaFrenado;
        }
        System.out.println("Avance - velocidad= "+dVelocidadActual);

    }
    public void frenarHastaDetener(){

    }


    public void acelerar(){


    }

    //setter and getter


    public String getsPlaca() {
        return sPlaca;
    }

    public void setsPlaca(String sPlaca) {
        this.sPlaca = sPlaca;
    }

    public double getdVelocidadMaxima() {
        return dVelocidadMaxima;
    }

    public void setdVelocidadMaxima(double dVelocidadMaxima) {
        this.dVelocidadMaxima = dVelocidadMaxima;
    }

    public boolean isbEncendidoMotor() {
        return bEncendidoMotor;
    }

    public void setbEncendidoMotor(boolean bEncendidoMotor) {
        this.bEncendidoMotor = bEncendidoMotor;
    }

    public boolean isbMovimiento() {
        return bMovimiento;
    }

    public void setbMovimiento(boolean bMovimiento) {
        this.bMovimiento = bMovimiento;
    }

    public boolean isbLucesEncendidas() {
        return bLucesEncendidas;
    }

    public void setbLucesEncendidas(boolean bLucesEncendidas) {
        this.bLucesEncendidas = bLucesEncendidas;
    }

    public double getdDistanciaFrenado() {
        return dDistanciaFrenado;
    }

    public void setdDistanciaFrenado(double dDistanciaFrenado) {
        this.dDistanciaFrenado = dDistanciaFrenado;
    }

    public double getdVelocidadActual() {
        return dVelocidadActual;
    }

    public void setdVelocidadActual(double dVelocidadActual) {
        this.dVelocidadActual = dVelocidadActual;
    }

    public double getdAceleracion() {
        return dAceleracion;
    }

    public void setdAceleracion(double dAceleracion) {
        this.dAceleracion = dAceleracion;
    }
}
