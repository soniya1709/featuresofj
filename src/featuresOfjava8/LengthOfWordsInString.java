package featuresOfjava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfWordsInString {
public static void main(String[] args) {
	List<String> list=Arrays.asList("Soniya","Ashu","Dnyaneshwar","Bali");
	Comparator<String> comp=(aName,bName)->aName.length()-bName.length();
	list.stream().min(comp).ifPresent(longest->System.out.println("min= "+longest));
	list.stream().max((a,b)->a.length()>b.length()?1:a.length()<b.length()?-1:0).ifPresent(longest->System.out.println("max= "+longest));
}
}
