

5A


class person{
	public String personName;
	}
public class NPE{
	public static void main(String args[]){
	try{
		person p=null;
		String name= p.personName;
		p.personName="RAMA";
		} catch(NullPointerException e){
		System.out.println("Entering NPE");
		e.printStackTrace();
		}
    }
    }


    output


    Entering NPE
    java.lang.NullPointerException: Cannot read field "personName" because "<local1>" is null
	  at NPE.main(NPE.java:8)

=== Code Execution Successful ===

5B


class Superclass{
	public Superclass(){
	System.out.println("Inside superclass constructor");
	}}
class sb_1 extends Superclass{
	public sb_1(){
	System.out.println("Inside subclass 1 constructor");
	}}
class sb_2 extends Superclass{
	public sb_2(){
	System.out.println("Inside subclass 2 constructor");
	}}
	
public class MainClass{
	public static void main(String []args){
	try{
	Superclass superObj= new sb_1();
	sb_2 suboobj= (sb_2) superObj;
	}
	catch(Exception e){
		System.out.println(e.getMessage());
		}
		}
		}
    output
    Inside superclass constructor
    Inside subclass 1 constructor
    class sb_1 cannot be cast to class sb_2 (sb_1 and sb_2 are in unnamed module of loader 'app')

     === Code Execution Successful ===


5C


import java.util.Date;
public class NFE{
public static void main(String[] args){
	try{
		String inputString="2550";
		System.out.println("Integer.parseInt("+ inputString +")="+Integer.parseInt(inputString ));
	}catch(NumberFormatException e){
		System.out.println("Number Format Exception thrown"+e.getMessage());
		}
		
	try{
		String inputString="255.0";
		System.out.println("Integer.parseInt("+ inputString +")="+Integer.parseInt(inputString ));
	}catch(NumberFormatException e){
		System.out.println("Number Format Exception thrown"+e.getMessage());
		}
	
	try{
		Date day= new Date();
		String inputString=day.toString();
		System.out.println("Integer.parseInt("+ inputString +")="+Integer.parseInt(inputString));
	}catch(NumberFormatException e){
		System.out.println("Number Format Exception thrown"+e.getMessage());
		}
		
	try{
		String inputString="1 2 3";
		System.out.println("Integer.parseInt("+ inputString +")="+Integer.parseInt(inputString));
	}catch(NumberFormatException e){
		System.out.println("Number Format Exception thrown"+e.getMessage());
		}
		
	try{
		String inputString="Lubhiana Khan";
		System.out.println("Integer.parseInt("+ inputString +")="+Integer.parseInt(inputString));
	}catch(NumberFormatException e){
		System.out.println("Number Format Exception thrown"+e.getMessage());
		}
		
		}}
    
    
    output
    
    
    Integer.parseInt(2550)=2550
    Number Format Exception thrownFor input string: "255.0"
    Number Format Exception thrownFor input string: "Mon Apr 01 09:28:09 GMT 2024"
    Number Format Exception thrownFor input string: "1 2 3"
    Number Format Exception thrownFor input string: "Lubhiana Khan"

          === Code Execution Successful ===
          
  5D
  
  
  public class OutOfStackMemoryErrorExample {
    public void createArray(int size) {
        try {
            Integer[] myArray = new Integer[size];
        } catch (OutOfMemoryError oome) {
            System.err.println("Array size too large");
            System.err.println("Max JVM Memory: " + Runtime.getRuntime().maxMemory());
        }
    }

    public static void main(String[] args) {
        OutOfStackMemoryErrorExample oome = new OutOfStackMemoryErrorExample();
        oome.createArray(1000 * 1000 * 1000);
    }
}


output

   Array size too large
   Max JVM Memory: 243269632

  === Code Execution Successful ===


5E


public class Outmem {
    public static void main(String[] args) throws Exception {
        int arrSize = 15;
        System.out.println("Maximum Memory()");
        long memoryConsumed = 0;
        try {
            long[] memoryAllocated = null;
            for (int loop = 0; loop < Integer.MAX_VALUE; loop++) {
                memoryAllocated = new long[arrSize];
                memoryAllocated[0] = 0;
                memoryConsumed += arrSize * Long.SIZE;
                System.out.println("Memory Consumed: " + memoryConsumed);
                arrSize *= arrSize * 2;
                Thread.sleep(500);
            }
        } catch (OutOfMemoryError outOfMemory) {
            System.out.println("Catching out of memory error");
            throw outOfMemory;
        }
    }
}


output


   Maximum Memory()
   Memory Consumed: 960
   Memory Consumed: 29760
   Memory Consumed: 25949760
   ERROR!
   Catching out of memory error
   Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at Outmem.main(Outmem.java:9)

         === Code Exited With Errors ===






