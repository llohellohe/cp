package yangqi.hotspot.proxy;

public class PeopleServiceImpl implements PeopleService {

	@Override
	public String foo1(String s1, Integer i) {
		System.out.println("Process In Impl foo1() "+s1+" "+i);
		return "hello "+s1;
	}

	@Override
	public String foo2(String s1, Integer i) {
		System.out.println("Process In Impl foo2() "+s1+" "+i);
		return "hello 2 "+s1;
	}

}
