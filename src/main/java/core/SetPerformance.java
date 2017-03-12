package core;
import java.util.*;
public class SetPerformance {

	       public static void main(String[] args) {
	              TreeSet<Integer> 				treeSet = new TreeSet<Integer>();
	              LinkedHashSet<Integer>  linkedHashSet = new LinkedHashSet<Integer>();
	              HashSet<Integer> 				hashSet = new HashSet<Integer>();
	              int max=100;
	              
	              // HashSet add
	              long startTime = System.nanoTime();
	              	for (int i = max; i >= 0; i--) hashSet.add(i);
	              long endTime = System.nanoTime();
	              long duration = endTime - startTime;
	              System.out.println("HashSet add: \t\t" + duration);
	              System.out.println(hashSet);
	              
	              // LinkedHashSet add
	              startTime = System.nanoTime();
	              	for (int i = max; i >= 0; i--) linkedHashSet.add(i); 
	              endTime = System.nanoTime();
	              duration = endTime - startTime;
	              System.out.println("LinkedHashSet add: \t" + duration);
	              System.out.println(linkedHashSet);

	              // TreeSet add
	              startTime = System.nanoTime();
	              	for (int i = max; i >= 0; i--) treeSet.add(i);
	              endTime = System.nanoTime();
	              duration = endTime - startTime;
	              System.out.println("TreeSet add:  \t\t" + duration);
	              System.out.println(treeSet);
	              
/*	//////////////////////////////////////////////////////////////////////////////////////////////
	              // HashSet iterate all
	              startTime = System.nanoTime();
	              Iterator<Integer> ihs = hashSet.iterator();
	              while (ihs.hasNext()) {
	                     @SuppressWarnings("unused")
	                     int i = (int) ihs.next(); }
	              endTime = System.nanoTime();
	              duration = endTime - startTime;
	              System.out.println("HashSet iterate all:  " + duration);
	              // LinkedHashSet iterate all
	              startTime = System.nanoTime();
	              Iterator<Integer> ilhs = linkedHashSet.iterator();
	              while (ilhs.hasNext()) {
	                     @SuppressWarnings("unused")
	                     int i = (int) ilhs.next(); }
	              endTime = System.nanoTime();
	              duration = endTime - startTime;
	              System.out.println("LinkedHashSet iterate all:  " + duration);
	              // TreeSet iterate all
	              startTime = System.nanoTime();
	              Iterator<Integer> its = treeSet.iterator();
	              while (its.hasNext()) {
	                     @SuppressWarnings("unused")
	                     int i = (int) its.next(); }
	              endTime = System.nanoTime();
	              duration = endTime - startTime;
	              System.out.println("TreeSet iterate all:  " + duration);
	              System.out.println("");
	//////////////////////////////////////////////////////////////////////////////////////////////
	              // HashSet remove
	              startTime = System.nanoTime();
	              
	              for (int i = 9999; i >=0; i--) {
	                     hashSet.remove(i); }
	              endTime = System.nanoTime();
	              duration = endTime - startTime;
	              System.out.println("HashSet remove: " + duration);
	              // LinkedHashSet remove
	              startTime = System.nanoTime();
	              for (int i = 9999; i >=0; i--) {
	                     linkedHashSet.remove(i); }
	              endTime = System.nanoTime();
	              duration = endTime - startTime;
	              System.out.println("LinkedHashSet remove: " + duration);
	              // TreeSet remove
	              startTime = System.nanoTime();
	              
	              for (int i = 9999; i >=0; i--) {
	                     treeSet.remove(i); }
	              endTime = System.nanoTime();
	              duration = endTime - startTime;
	              System.out.println("TreeSet remove:  " + duration);*/
	              
}
}

