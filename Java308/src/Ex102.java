import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Ex102 {
	public static void main(String[] args) {
		System.out.println(getList(""));
		
		System.out.println(getList("A"));
	}
	
	
	public static List<String> getList(String str){
		
		if(StringUtils.isBlank(str)) {
			return Collections.emptyList();
		}
		
		return Arrays.asList(str);
	}
}
