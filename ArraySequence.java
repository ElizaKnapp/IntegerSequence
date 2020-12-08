import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other) {
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = data[0];
  }

  public void reset() {
    currentIndex = start;
  }

  public ArraySequence(IntegerSequence otherseq) {
    reset(otherseq);
  }
}
