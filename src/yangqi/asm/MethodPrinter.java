package yangqi.asm;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

public class MethodPrinter extends MethodVisitor {

	public MethodPrinter(int api) {
		super(api);
	}

	
	
	 public void visitCode() {
		 System.out.println("CODE VISIT");
	 }
	 
	 
	  public void visitLineNumber(int line, Label start) {
		 System.out.println("LINE VISIT:"+line);
		  
	  }
}
