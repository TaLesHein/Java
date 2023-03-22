package example;

public class Fatorial {
    
    private int num = 0;
    private int fat = 1;
    private String form = "";

    public void setValor(int n){

        num = n;
        int f = 1;
        String s = "";

        for (int i = n; i > 1 ; i--){
            f *= n;
            s += i + " x ";

        }

        s += "1 = ";
        fat = f;
        form = s;

    }

    public int getFatorial(){
        return fat;
    }

    public String getFormula(){
        return form;
    }
}
