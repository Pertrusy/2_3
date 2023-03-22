import java.util.Random;
class Main {
  public static void main(String[] args) {
    int n = 5;
    int max = 9;
   int sum = 0;

    Random rand = new Random();

    for (int i = 0; i < n; i++) {
      int num = rand.nextInt(max+1);
      sum += num*num;
    }
      System.out.println("Suma kwadratów " + n + "Losowych liczb z zakresu [0," + max + "]: " + sum);

        
  }
  }
