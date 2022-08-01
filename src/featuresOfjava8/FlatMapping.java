package featuresOfjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapping {
public static void main(String[] args) {
	List<List<Integer>> fm=new ArrayList();
	fm.add(Arrays.asList(1,2));
	fm.add(Arrays.asList(3,4));
	fm.add(Arrays.asList(5,6));
	fm.add(Arrays.asList(7,8));
	System.out.println(fm);
	List l1=fm.stream().flatMap(l->l.stream()).collect(Collectors.toList());
	System.out.println(l1);
}
}
