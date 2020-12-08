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
    currentIndex = 0;
  }

  public int length() {
    return data.length;
  }

  public boolean hasNext() {
    boolean ans = false;
    if (currentIndex <= data.length) {
      ans = true;
    }
    return ans;
  }

  public int next() {
    int holder = currentIndex;
    if (!hasNext()) {
      throw new NoSuchElementException("there is no next, you've reached the end");
    }
    else {
      currentIndex++;
    }
    return holder;
  }

  public ArraySequence(IntegerSequence otherseq) {
    reset(otherseq);
  }
}
