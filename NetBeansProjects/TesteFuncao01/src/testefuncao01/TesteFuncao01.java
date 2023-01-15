package testefuncao01;

public class TesteFuncao01 {

    static void soma(int a, int b){
        int soma = a + b;
        System.out.println("A soma é " + soma);
    }
    
    static int sub (int a, int b) {
        int sub = a - b;
        return sub;
    }
           
    public static void main(String[] args) {
        soma(5, 6);
        System.out.println(sub(10, 7));
    }
    
}
