package yangqi.agent;

import java.lang.instrument.Instrumentation;

public class SimpleMain {

	
	public static void premain(String agentArguments, Instrumentation instrumentation) {	
		
		
		System.out.println("PRE MAIN,argument is "+agentArguments);
		
		instrumentation.addTransformer(new SimpleTransformer());
		
		GlobalInstrument.setGlobalInstrument(instrumentation);
		
		
		
	}	

}
