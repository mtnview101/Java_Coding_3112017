package core;

public class BenchmarkingStrings {
public static void main(String[] args) {
String string = "a";
StringBuffer sbffr = new StringBuffer("a");
StringBuilder sbldr = new StringBuilder("a");
int max = 100000;

long start = System.currentTimeMillis();
	for (int i = 0; i < max; i++) string = string.concat("b");
long finish = System.currentTimeMillis();
long result = (finish - start);
System.out.println("Using String, elapsed milliseconds: " + result);
  
start = System.currentTimeMillis();// StringBuffer is a thread-safe, mutable sequence of characters. 
								   // A string buffer is like a String, but can be modified
	for (int i = 0; i < max; i++) sbffr = sbffr.append("b");
finish = System.currentTimeMillis();
result = (finish - start);
System.out.println("Using StringBuffer, elapsed milliseconds: " + result);

start = System.currentTimeMillis(); // StringBuilder be used in preference to StringBuffer as it will be faster under most implementations.
	for (int i = 0; i < max; i++) sbldr = sbldr.append("b");
finish = System.currentTimeMillis();
result = (finish - start);
System.out.println("Using StringBuilder, elapsed milliseconds: " + result);
  
  
}
}

