import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other) {
    data = other;
    currentIndex = 0;
  }

  public void reset() {
    currentIndex = 0;
  }

  public int length() {
    return data.length;
  }

  public boolean hasNext() {
    boolean ans = false;
    if (currentIndex < data.length) {
      ans = true;
    }
    return ans;
  }

  public int next() {
    int holder = 0;
    if (!hasNext()) {
      throw new NoSuchElementException("there is no next, you've reached the end");
    }
    else {
      holder = data[currentIndex];
      currentIndex++;
    }
    return holder;
  }

  public ArraySequence(IntegerSequence otherseq) {
    otherseq.reset();
    int counter = 0;
    int[] holder = new int[otherseq.length()];
    while (otherseq.hasNext()) {
      holder[counter] = otherseq.next();
      counter++;
    }
    data = holder;
    otherseq.reset();
  }

}
