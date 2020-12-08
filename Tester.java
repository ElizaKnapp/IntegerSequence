public class Tester {
  public static void main(String[] args) {
    /*
    IntegerSequence r = new Range(10,15);
        while(r.hasNext()){
          System.out.print(r.next());
          if( r.hasNext() ){
             System.out.print( ", " );
          }
        }
        System.out.println();

    //constructor, length, next and has next work
    IntegerSequence t1 = new Range(-2, 5);
    for (int i = 0; i < t1.length(); i++) {
      System.out.println(t1.next());
    }

    //reset
    IntegerSequence t2 = new Range(0, 9);
    for (int i = 0; i < 5; i++) {
      t2.next();
    }
    System.out.println(t2.next());
    t2.reset();
    System.out.println(t2.next());
 */

    int[] nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);

    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();

  }
}
