package chainofresposibility;

public class TestCalChainUsingMain {
       public static void main(String[] args) {
    	   Chain chainCalc1=new AddNumbers();
    	   DivNumbers chainCalc2=new DivNumbers();
    	   Chain chainCalc3=new MulNumber();
    	   Chain chainCalc4=new SubNumber();
    	   
    	   chainCalc1.setNextChain(chainCalc2);
    	   chainCalc2.setNextChain(chainCalc3);
    	   chainCalc3.setNextChain(chainCalc4);
    	    
    	   Numbers request=new Numbers(4,2,"add");
    	   chainCalc1.calculate(request);
       }
}
