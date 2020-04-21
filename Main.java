public class Main {


      static void printEgyptian(int nr, int dr){
          if(nr == 0 || dr == 0){
              return;
          }
          if(dr % nr == 0) {
              System.out.print("1/" + dr / nr);
              return;
          }
          if(nr % dr == 0) {
              System.out.print(nr / dr);
              return;
          }
          if(nr > dr){
              System.out.print(nr / dr + " + ");
              printEgyptian(nr % dr, dr);
              return;
          }
          int n = dr / nr + 1;
          System.out.print("1/" + n + " + ");

          printEgyptian(nr * n - dr, dr * n);
      }

    public static void main(String[] args) {
	// Greedy Algorithm to find Egyptian Fractions: A decomposition of a fraction

        int nr = 6;
        int dr = 14;
        System.out.println("Egyptian Fraction representation of " + nr + "/" + dr + " will be");
        printEgyptian(nr, dr);
    }
}
