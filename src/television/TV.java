package television;

public class TV {
    private int tamanho;
    private int canal;
    private int volume;
    private boolean ligada;
    public TV(int tamanho) {
        this.tamanho = tamanho;
        this.canal = 0;
        this.volume = 0;
        this.ligada = false;
    }

    protected void setLigada(boolean b) {
        if(b) {
            ligada = true;
        } else if(!b) {
            ligada = false;
        }
    }

    public boolean isLigada() {
        if(ligada) {
            return true;
        } else {
            return false;
        }
    }

}