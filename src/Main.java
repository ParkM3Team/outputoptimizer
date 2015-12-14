
public class Main {

	public static final int MINVALUE = 5;
	public static final int STARTVALUE = 100;
	
	public static void main(String[] args){
		int bestSolution = 0;
		boolean foundSolution = false;
		int potentialSolution = STARTVALUE;
		int result = someFunction(potentialSolution);
		int previousSolution;
		int previousResult;
		if(result<MINVALUE){
			System.out.println("NO POSSIBLE ANSWER");
		}else{
			previousSolution = potentialSolution;
			previousResult = result;
			potentialSolution--;
			while(!foundSolution){
				result = someFunction(potentialSolution);
				if(potentialSolution<MINVALUE){
					//Gone to far, last solution is best
					System.out.println("BEST SOLUTION: "+previousSolution);
					foundSolution = true;
				}else{
					//This is also a solution, we can keep going!
					previousSolution = potentialSolution;
					previousResult = result;
					potentialSolution--;
				}
			}
		}
	
		
		
		
	}
	
	
	
	static int someFunction(int x){
		return x;
	}
	
	
}
