package aula.poo.java;

public class ControleRemoto implements Controlador {

    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //metodo especial construtor
    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume(){
        return volume;
    }

    private boolean getLigado(){
        return ligado;
    }

    private boolean getTocando(){
        return tocando;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    //metodos abstratos(da minha classe controlador)
        public void ligar(){
            this.setLigado (true);
        }

        public void desligar(){
            this.setLigado (false);
        }

        public void abrirMenu() {
            if (this.getLigado()) {
                System.out.println("MENU");
                System.out.println("Esta ligado? " + this.getLigado());
                System.out.println("Esta tocando? " + this.getTocando());
                System.out.print("Volume " + this.getVolume());
                for (int i = 1; i <= this.getVolume(); i += 1) {
                    System.out.print(" |");
                }
            } else {
                System.out.println("Erro! O aparelho esta desligado");
            }
        }

        public void fecharMenu(){
            System.out.println("Fechando menu...");
        }

        public void maisVolume(){
            if (this.getLigado()){
                this.setVolume(this.getVolume() + 1);
            }
        }

        public void menosVolume(){
            if (this.getLigado()){
                this.setVolume(this.getVolume() - 1);
            }
        }

        public void ligarMudo(){
            if (this.getLigado() && this.getVolume() > 0 ){
                this.setVolume(0);
            }
        }

        public void desligarMudo(){
            if (this.getLigado() && this.getVolume() == 0){
                this.setVolume(50);
            }
        }

        public void play(){
            if (this.getLigado() && ! this.getTocando()){
                this.setTocando(true);
            }
        }

        public void pause(){
            if (this.getLigado() && ! this.getTocando()){
                this.setTocando(false);
            }
        }

}
