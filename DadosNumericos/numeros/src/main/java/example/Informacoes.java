package example;

public class Informacoes {

    private int cont, soma, par, imp, acima;

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    public int getImp() {
        return imp;
    }

    public void setImp(int imp) {
        this.imp = imp;
    }

    public int getAcima() {
        return acima;
    }

    public void setAcima(int acima) {
        this.acima = acima;
    }


    public void definirInfo(int cont, int soma, int par, int imp, int acima){

        setCont(cont);
        setSoma(soma);
        setPar(par);
        setImp(imp);
        setAcima(acima);
    }
}
