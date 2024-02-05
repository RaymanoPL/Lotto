import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class SetUniqueNumberGenerator implements UniqueNumberGenerator {
    private final int firstNumber;
    private final int lastNumber;
    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private final int range;
    private final Set<Integer> set = new HashSet<>();

    public SetUniqueNumberGenerator(int firstNumber, int lastNumber) {
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
        if (firstNumber > lastNumber)
            throw new IllegalArgumentException("lastNumber must be greater than firstNumber");
        this.range = lastNumber - firstNumber + 1;
    }

    @Override
    public int nextNumber() {
        if (set.size() == range)
            throw new NoSuchElementException("All numbers have already been drawn");
        int number;
        do {
            number = random.nextInt(firstNumber, lastNumber + 1);
        } while (!set.add(number));
        return number;
    }

}
