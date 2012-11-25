package yangqi.asm;

import java.io.IOException;

import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class ClassPrinter extends ClassVisitor {

    public ClassPrinter() {
        super(Opcodes.ASM4);
    }

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        
    	printClass("yangqi.asm.ConPeople");
    	printClass("yangqi.asm.ConPeople2");
    	
    	printClass("yangqi.asm.PeopleWithSignature");
    }
    
    private static void printClass(String name) throws IOException{
    	ClassPrinter printer = new ClassPrinter();
        ClassReader cr = new ClassReader(name);

      //  System.out.println(cr.getClassName());

        cr.accept(printer, 0);
        
        System.out.println("=====");
    }

    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {

        System.out.println("METHOD VISIT [ access:" + access + ",name:" + name + ",desc:" + desc + ",signature:"
                           + signature);
        return new MethodPrinter(Opcodes.ASM4);
    }

    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println("version:" + version + ",name" + name +",signature:"+signature+ " ,extends " + superName + " {");
    }

    public void visitSource(String source, String debug) {
        System.out.println("SOURCE VISIT " + source + ",debug " + debug);
    }

    public void visitEnd() {
        System.out.println("}");
    }

    public void visitAttribute(Attribute attr) {
        System.out.println("VISIT attr");
    }

    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {

        System.out.println("VISIT FILED [ access:" + access + ",name:" + name + " desc: " + desc + ",signature:"
                           + signature + ",value:" + value);
        return null;
    }
}
