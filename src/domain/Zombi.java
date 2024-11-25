package domain;

public abstract class Zombi {

    protected int vida;
    protected int daño;

    public Zombi(int vida, int daño){
        this.vida = vida;
        this.daño = daño;
    }

    public abstract String getImagePath();

    public void recibirDaño(int daño){
        int nuevaVida = vida - daño;
        this.vida = nuevaVida;
    }

    public int getDaño(){
        return daño;
    }

    public void atacar(){

    }

    public void avanzar(){

    }

    public void morir(){

    }
}
