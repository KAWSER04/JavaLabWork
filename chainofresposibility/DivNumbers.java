package chainofresposibility;

public class DivNumbers implements Chain {

private Chain nextInChain;
	
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain=nextChain;
		
	}
	
	@Override
	public void calculate(Numbers requests) {
		if(requests.getCalculationWanted()=="div") {
			System.out.println(requests.getNumber1() + " / " + requests.getNumber2() +
					" = " + (requests.getNumber1() + requests.getNumber2()));
		}
		else {
			nextInChain.calculate(requests);
		}
	}

}
