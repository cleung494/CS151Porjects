import java.util.*;
import java.io.*;
import java.util.function.LongUnaryOperator;

/**
 *
 * @author chris
 */
public interface NumberSequence {
    long next();
    // constructs an instance of a finite sequence by specifying elements
    static of(long... args)
    {
        class FiniteSequence implements NumberSequence
        {
            private int n = 0;
            public boolean hasNext()
            {
                if (n == 0)
                {
                    return false;
                }
                else{
                    return n < args.length;
                }
            }
            
            @Override
            public long next()
            {
                n++;
                return args[n-1];
            }
           

            @Override
            public double average() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        return new FiniteSequence();
    }
    //computes the average of the first n elements(or all the elements if there are fewer)
    default double average(int n) 
    {
        double ret = 0;
        double sum = 0;
        while (hasNext() && ret<n)
        {
            sum+= next();
            ret++;
        }
        if (ret == 0)
        {
            return 0;
        }
        else{
            return (sum/ret);
        }
    }
    //computes the average of all elements
   default double average() 
   {
      int i = 0;
      double sum = 0;
      while (hasNext())
      {
         sum += next();
         i++;
      }
      return i == 0 ? 0 : sum / i;
   }
   
   //yields an array of the first n elements of the sequence
    default long[] toArray(int n)
    {
      long[] result = new long[n];
      int i = 0;
      double sum = 0;
      while (i < n && hasNext())
      {
         result[i] = next();
         i++;
      }
      //someone told me this, not sure...?
      if (i < n) return Arrays.copyOf(result, i);
      else return result;
    }
   
    default boolean hasNext() { return true; }
    
    //produces an infinite stream of values seed, f(seed), f(f(seed))
    static NumberSequence iterate(long seed, LongUnaryOperator f)
    {
      class IteratedSequence implements NumberSequence
      {
         long current = seed;
         public long next()
         {
            long result = current;
            current = f.applyAsLong(current);
            return result;
         }
      }
      
      return new IteratedSequence();
    }
       
}

