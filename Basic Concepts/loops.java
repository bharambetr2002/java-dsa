public class loops {
  public static void main(String[] args) {

    // while loop
    /*
     * while(comdition){
     * task
     * }
     */

    int count = 0;
    while (count < 5) {
      System.out.print("Hello World ");
      count++;
    }
    System.out.println(count);

    /*
     * for loop
     * for (initialisation; condition;updation){
     * task
     * }
     */

    for (count = 0; count <= 5; count++) {
      System.err.print("Hey Tanmay !!  ");
    }

    /*
     * Do While loop
     * do{
     * task
     * }while{condition};
     */

    int counts = 1;
    do {
      System.out.println("Helo world");
      counts++;
    } while (counts <= 10);
  }
}
