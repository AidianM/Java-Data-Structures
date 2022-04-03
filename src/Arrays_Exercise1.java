/*
Exc 1:
Write a program to sum all the values of a given Array in 
Java.
What is the output?
          double[ ] exampleArray = {1,5,6,5,4,1};

          double maximum = examplesArray[0];

          int index = 0;

          for (int i = 1; i<exampleArray.length>; i++){

               if (exampleArray[ i ] > maximum) {

                    maximum = exampleArray[ i ];

                    index = i;

               }

          }

          System.out.println(index);

Exc2:
Write a public static method called "toPower" that takes 
in as parameters two integers called size and power. The 
method should return an **array** of size "size" with each 
array index raised to the value of "power." 

So, for example, if we passed in "size = 4" and "power = 2"
to the "toPower," the method should return the following 
result: [0,1,4,9].
*/

//Re: with each slot in the array = its index location^power

//Exc2:
public class Arrays_Exercise1 {
				//return an array = int/double/etc
	public static double[] toPower(int size, int power){
		double[] returnValue = new double[size];
		
		for (int index=0; index<size;++index) {
			returnValue[index] = Math.pow(index, power);
					//google time: how to exponentiate in java - Math.pow(index, power);
		}
		
		
		return returnValue;
	}
	
			public static void main(String[] args) {

				double[] values = toPower(4,2);
				//values should equal [0,1,4,9] eg [0^0, 1^1, 2^2, 3^3]
		
				for (double value: values) {
					System.out.println(value);
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
