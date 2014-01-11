###序列化ID
序列化ID用于验证序列化对象的发送者和接受者是否加载了与该序列化兼容的类。

如果序列化ID不同，则会报InvalidClassException。

序列化ID必须是final public 的long类型，同时建议是private的。

###toString()方法
序列化和反序列化默认并不会调用对象的toString()方法。

###序列化ID相同，类签名不同依旧会报错。
如果两个类的序列化ID相同，但是类名不同，会报ClassCastException 。

即使是子类关系也不行。

###在序列化和反序列化的时候添加额外逻辑
通过重新实现writeObject和readObject方法即可。

如：
		
		private void writeObject(ObjectOutputStream output) throws IOException {
		    output.defaultWriteObject();
		    output.writeUTF("Hello World");
        }
		private void readObject(ObjectInputStream input) throws IOException, ClassNotFoundException {
		    input.defaultReadObject();
		    String value = input.readUTF();
		    System.out.println(value);
		} 
		
		
在序列化的时候，额外写了一个字符串，同时在反序列化的时候，额外读了一个字符串。

由于反序列化的时候，并不会调用对象的构造函数。

因此对于某些需要在构造函数中初始化的字段，直接反序列化回来是不完善的，需要将这段逻辑添加到readObject方法中。