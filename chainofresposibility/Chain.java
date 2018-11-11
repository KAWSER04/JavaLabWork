package chainofresposibility;

public interface Chain {
       public void setNextChain(Chain nextChain);
       
       public void calculate(Numbers requests);
}
