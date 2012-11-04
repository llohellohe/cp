package yangqi.agent;

public class TestRun {

	/**
	 * @param args
	 * run as -Dpro.t=test.pro -javaagent:/Users/yangqi/opensource/cp/src/agent.jar
	 */
	public static void main(String[] args) {
		System.out.println("GO11");
		new WWE().speak();
		String str1="a";
		String str2="ah";
		
		System.out.println("string :"+GlobalInstrument.getObjectSize(str1));
		System.out.println("string :"+GlobalInstrument.getObjectSize(str2));
		System.out.println("int :"+GlobalInstrument.getObjectSize(123));
		System.out.println("int :"+GlobalInstrument.getObjectSize(1234));
		System.out.println("double :"+GlobalInstrument.getObjectSize(123.0d));
		System.out.println("double :"+GlobalInstrument.getObjectSize(1234.0d));
		
		
		SizeOf.setInst(GlobalInstrument.getGlobalInstrument());
		System.out.println("===============");
		System.out.println("deep string :"+SizeOf.deepSizeOf(str1));
		System.out.println("deep string :"+SizeOf.deepSizeOf(str2));
		System.out.println("deep string :"+SizeOf.deepSizeOf("ac"));
		System.out.println("deep int :"+SizeOf.deepSizeOf(123));
		System.out.println("deep int :"+SizeOf.deepSizeOf(1234));
		System.out.println("deep double :"+SizeOf.deepSizeOf(123.0d));
		System.out.println("deep double :"+SizeOf.deepSizeOf(1234.0d));
		
		String s="a";
		for(int i=0;i<100;i++){
			s+="a";
		System.out.println("deep string :,length to "+i+" "+SizeOf.deepSizeOf(s));
		}
	}

}
