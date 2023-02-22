class Main {
  
  public static void main(String[] args) {
        
        printReverse(); // Don't change anything here. Simply run the code to test the output.
  }


  public static void printReverse()  {
    int num = (int) (1000 + Math.random() * 9000);
    System.out.println("The generated random number is :" + num);
    int n1 = num % 10;
    int n2 = (num % 100) / 10;
    int n3 = (num % 1000) / 100;
    int n4 = num / 1000;
    System.out.println(""+n1 + n2 + n3 + n4);
        // Write the method implementation here

    }
}