package yangqi.agent;

import java.lang.instrument.Instrumentation;

public class GlobalInstrument {
	private static Instrumentation globalInstrument;

	public static Instrumentation getGlobalInstrument() {
		return globalInstrument;
	}

	public static void setGlobalInstrument(Instrumentation globalInstrument) {
		GlobalInstrument.globalInstrument = globalInstrument;
	}
	
	public static long getObjectSize(Object obj){
		return globalInstrument.getObjectSize(obj)	;
	}
}
