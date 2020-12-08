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

  public int length() {
    return data.length();
  }


  public ArraySequence(IntegerSequence otherseq) {
    reset(otherseq);
  }
}
