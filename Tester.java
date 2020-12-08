public class Tester {
  public static void main(String[] args) {
    IntegerSequence r = new Range(10,15);
        while(r.hasNext()){
          System.out.print(r.next());
          if( r.hasNext() ){
             System.out.print( ", " );
          }
        }
        System.out.println();

    IntegerSequence t1 = new Range(-2, 5);
    for (int i = 0; i < t1.length(); i++) {
      System.out.println(t1.next());
    }

  }
}
