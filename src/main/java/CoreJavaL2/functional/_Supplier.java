package CoreJavaL2.functional;

import java.util.List;
import java.util.function.Supplier;


public class _Supplier {

	public static void main(String[] args) {
		System.out.println(getConnUrl());
		System.out.println(getUrl.get());
		System.out.println(getList.get());
	}
	static Supplier<String> getUrl = ()-> "sadfasadff.fasdas.erwer";
	static Supplier<List<String>> getList = () -> List.of("sdffsadfs","dasdfsdf");
	static String getConnUrl() {
		return "sdfsdfs.fsdfsd@dfsdf";
	}

}
