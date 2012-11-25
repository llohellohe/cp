package yangqi.agent;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import yangqi.hotspot.classlifecycle.People;

public class RunClassByByte2 extends ClassLoader {

    /**
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws SecurityException
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException,
                                          IllegalAccessException, SecurityException, NoSuchMethodException,
                                          IllegalArgumentException, InvocationTargetException {

        RunClassByByte2 b = new RunClassByByte2();

        Class clazz = Class.forName("yangqi.hotspot.classlifecycle.People");

        System.out.println(clazz);

        Object obj = clazz.newInstance();

        System.out.println(obj);

        System.out.println(obj.getClass().getClassLoader());

        People p = new People();

        System.out.println(p.getClass().getClassLoader());

        Method m = clazz.getMethod("speak", null);

        p = (People) obj;

        p.speak();

        // m.invoke(obj, null);

    }

    protected Class<?> findClass() throws ClassNotFoundException {

        try {
            byte[] result = getBytes();

            return this.defineClass("yangqi.hotspot.classlifecycle.People", result, 0, result.length);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    private static byte[] getBytes() throws IOException {
        People people = new People();
        Class clazz = people.getClass();

        System.out.println(clazz.getName());

        InputStream is = clazz.getClassLoader().getResourceAsStream(clazz.getName().replace(".", "/") + ".class");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        int i;

        while ((i = is.read()) != -1) {
            outputStream.write((byte) i);
        }

        byte[] resultBytes = outputStream.toByteArray();

        System.out.println(resultBytes.length);

        System.out.println(new String(resultBytes));

        return resultBytes;
    }

}
