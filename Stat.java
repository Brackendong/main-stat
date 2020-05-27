/*
* Stat.java
* Author: JiaoAng Dong
* Submission Date: 10/31/19
*
* Purpose: The Stat class contains getter 
* and setter method of a data type array. It
* also contains other methods such as min ,max
* average and mode methods for the array.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
  public class Stat {
// setting up the instance variable
  private double[] data;
	
//default constructor for stat, double 
//array with single element 0.0.
  public Stat() {
	  
	  data = new double[1];
	  data[0] = 0.0;
	  
  }
//constructor using the array of d
//new, but same, values are set from
//a for loop. Matching each index together
  public Stat(double[] d){
	  
	  data = new double[d.length];
	  for (int i = 0 ; i < d.length ; i++) {
		   data[i] = d[i];
	  }
	 
	  
  }
// get method, returns a new array that is
// a copy of the array, using a loop
  public double[] getData() {
	  
	  double[] newcopy = new double[data.length];
	  for (int i = 0 ; i < data.length ; i++) {
		  newcopy[i] = data[i];
	  }
	  return newcopy;
  }
// set method, void method that set the 
// instance variable to the new double[]
// using a loop and matching the indexes together.
  public void setData(double[] d) {
	  
	  data = new double[d.length];
	  for (int i = 0 ; i < data.length ; i++) {
		  data[i] = d[i];
	  }
	  
  }
// equals method, first the two arrays need to 
// be the same length, then, by using a loop we
// test if each index has the same values.
  public boolean equals(Stat s) {
	  
	  if (s.data.length != data.length)
	  { return false;}
	 
	  for (int i = 0 ; i < data.length ; i++) {
	  if (data[i] != s.data[i] )
	  {
		  return false;
	  }
		 
	  }
	  
	  return true;
	 
  }
// toString method, returns a new String
// that stores the data array inside brackets.
  public String toString() {
	  
	  String list = "";
	  
	  if (data.length == 1)
	  {
		  list = "[" + data[0] + "]";
	  }
	  else
	  {
		  for (int i = 0 ; i < data.length ; i++) {
			  if (i == 0)
			  {
				  list = "[" + data[0] + ",";
			  }
			  else if (i+1 == data.length)
			  {
				  list += data[i] + "]";
			  }
			  else
			  {
				  list += data[i] + ",";
			  }
	  }
	  }
				  
      return list;
  }
// min method, returns the minimum value of the array
// using a loop by comparing each values with the 
// previous values.
  public double min() {
	 
	  double min = data[0];
	     
      for(int i=0; i<data.length; i++ ) {
         if(data[i]<min) {
            min = data[i];
         }
      }
      return min;
	  
  }
	  
//max method, returns the maximum value of the array
//using a loop by comparing each values with the 
//previous values. 
			
  public double max() {
	  
  double max = 0;
	     
  for(int i=0; i< data.length; i++ ) {
     
	  if(data[i]>max) {
            
    	  max = data[i];
         }
      }
      return max;
 
  }
// average method, finds the total average of the 
// array, finding the sum of all the indexes/values
// using a loop. then divides it with the total length
// of the array.
  public double average() {
	
	  double sum = 0; 
	  
	    for (int i=0; i< data.length; i++) 
	       sum += data[i]; 
	  
	    return sum/data.length;
  
	  
  }
// mode method, finds the mode of the data array.
// using a nested loop for counting the repeating
// values, then compares which repeating value
// occurs the most often(mode).
// prints NaN if there are multiple modes, or no modes
  public double mode() {
	 
	  double mode = data[0]; 
	  double repeat = 0; 
	  double prevRepeat = 0; 

	  for (int i=0; i<data.length; i++) { 

	        for (int j=i; j<data.length; j++) { 

	            if ( data[i] == data[j]) { 
	                repeat++; 
	            }
	        }
	        
	            if (repeat>prevRepeat) { 
                mode=data[i]; 
                prevRepeat = repeat; 

            }
               else if(repeat==prevRepeat) {
            	mode=Double.NaN;
            }
	        
	        repeat=0; 
	    }
	    return mode;
  
	  
  }

}
