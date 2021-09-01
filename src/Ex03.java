public class Ex03 {
    public class Ex03 {
        /** Calcula série Fibonacci.*/
        public int calculaFibonacci(int n) {
            if (n <= 2) {
                return 1;
            } else {
                return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
            }
        }
    }
}
