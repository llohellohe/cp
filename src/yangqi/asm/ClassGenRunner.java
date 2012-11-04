package yangqi.asm;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class ClassGenRunner extends ClassLoader implements Opcodes {

    /**
     * @param args
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        ClassWriter cw = new ClassWriter(0);
        cw.visit(V1_6, ACC_PUBLIC, "com/yangqi/NewWorld", null, "java/lang/Object", null);

        MethodVisitor mw = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        // pushes the 'this' variable
        mw.visitVarInsn(ALOAD, 0);
        // invokes the super class constructor
        mw.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        mw.visitInsn(RETURN);
        // this code uses a maximum of one stack element and one local variable
        mw.visitMaxs(1, 1);
        mw.visitEnd();
        // cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "age", "I", null, new Integer(20)).visitEnd();

        // MethodVisitor mw = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);

        // mw.visitEnd();
        cw.visitMethod(ACC_PUBLIC + ACC_ABSTRACT, "show", "(Ljava/lang/String;)I", null, null).visitEnd();
        // MethodVisitor mw = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        cw.visitEnd();

        byte[] b = cw.toByteArray();

        // System.out.println(new String(b));

        ClassGenRunner runner = new ClassGenRunner();

        Class clazz = runner.defineClass("com.yangqi.NewWorld", b);
        Object obj = clazz.newInstance();

        // clazz.getMethod("", parameterTypes);

    }

    public Class defineClass(String name, byte[] b) {
        return defineClass(name, b, 0, b.length);
    }
}
