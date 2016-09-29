/**
 *
 * @author chris
 */
public class SquareSequence implements NumberSequence {
    private long num;
    @Override
    public long next() {
        
        long res = num * num;
        num++;
        return res;
    }
    
}
