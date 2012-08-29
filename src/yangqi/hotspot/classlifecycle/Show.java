package yangqi.hotspot.classlifecycle;

public class Show {

	/**
	 *<p> run this code wich jvm arguments: -verbose:class</p>
	 *Show class load info
	 */
	public static void main(String[] args) {
		
		Student s=new Student();
		
		new DummyServiceImpl();

	}

}
