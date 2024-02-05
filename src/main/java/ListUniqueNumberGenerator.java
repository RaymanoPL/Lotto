import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;

public class ListUniqueNumberGenerator implements UniqueNumberGenerator {
    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private final List<Integer> list;

    public ListUniqueNumberGenerator(int firstNumber, int lastNumber) {
        if (firstNumber > lastNumber)
            throw new IllegalArgumentException("lastNumber must be greater than firstNumber");
        this.list = new ArrayList<>(lastNumber - firstNumber + 1);
        for (int i = firstNumber; i <= lastNumber; i++) {
            list.add(i);
        }
    }

    @Override
    public int nextNumber() {
        if (list.isEmpty())
            throw new NoSuchElementException("All numbers have already been drawn");
        return list.remove(random.nextInt(list.size()));
    }
}
