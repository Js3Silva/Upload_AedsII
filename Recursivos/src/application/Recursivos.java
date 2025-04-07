public class Recursivos {

    /**
     * Calcular a soma dos n primeiros n meros positivos.
     * @param n Quantidade de n meros a serem somados.
     * @return Soma dos n primeiros n meros positivos.
     */
    public static int soma(int n){
        if(n==1)
          return 1;

        return n + soma(n-1);
    }

    /**
     * Calcular a soma das fra es de 1 ate n.
     * @param n Quantidade de termos.
     * @return Soma das fra es de 1 ate n.
     */
    public static int fracoes(int n){
        if(n==1)
          return 1;

        return 1/n + soma(n-1);
    }

    /**
     * Calcular o valor de x elevado a k.
     * @param x Base.
     * @param k Expoente.
     * @return O valor de x elevado a k.
     */
    public static int potencia(int x, int k){
        if(k==0)
          return 1;
        else if(k==1)
          return x;
        
        return x * potencia(x, k-1);
    }

    /**
     * Calcular o n-simo termo da sequ ncia de tribonacci.
     * A sequência de tribonacci é uma sequência semelhante a sequência de Fibonacci,
     * só que cada termo é a soma dos 3 termos anteriores.
     * @param n O n mero do termo na sequência.
     * @return O valor do n-simo termo da sequ ncia de tribonacci.
     */
    public static int tribonacci(int n){
        if(n==0 || n==1)
            return 0;
        else if(n==2)
            return 1;
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }


    /**
     * Calcular o n-simo termo da sequência de Pell.
     * A sequência de Pell é uma sequência de números inteiros que surge em
     * diversas áreas da matemática, como a teoria dos n meros e a geometria.
     * @param n O número do termo na sequência.
     * @return O valor do n-simo termo da sequência de Pell.
     */
    public static int pell(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        return 2*pell(n-1) + pell(n-2);
    }

    public static void main(String[] args) {
        int result = potencia(2,3);
        System.out.printf("%d", result);
    }
}
