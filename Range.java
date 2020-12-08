import java.util.NoSuchElementException;

public class Range implements IntegerSequence {
  private int start, end, current;

  public Range(int start, int end) {
    if (start > end) {
      throw new IllegalArgumentException("start has to be less than end");
    }
    this.start = start;
    this.end = end;
    current = start;
  }
  
  public void reset() {
    current = start;
  }

  public int length() {
    return end - start + 1;
  }
}
