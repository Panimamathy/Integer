package Leapyear;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set {
      public static void main(String[] args) {
		Set<Integer> a = new HashSet<>();
		a.addAll(Arrays.asList((new Integer[] {1,2,3,5,8,6,7})));
		Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList((new Integer[] {5,8,9,11,14,16,7})));
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println(difference);
        System.out.println(a);
        Set<Integer> c = new HashSet<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        System.out.println(c);
        int max = Collections.max(c);
        int min = Collections.min(c);
        c.remove(max);
        c.add(8);
        
        Set<String> d = new HashSet<>();
        d.addAll(Arrays.asList(new String[] {"abc","bce","def"}));
        String f= "pan";
        
        System.out.println(d.contains(f));
        int n = d.size();
        String[] arr = new String[n];
        
        
        for (String x : d)
        {
        	int i=0;
			arr[i++]=x;
        	System.out.println((Arrays.toString(arr)));
        	
        	
        }
        
        }
        System.out.println();

}
}
