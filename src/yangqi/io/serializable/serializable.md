###序列化ID
序列化ID用于验证序列化对象的发送者和接受者是否加载了与该序列化兼容的类。

如果序列化ID不同，则会报InvalidClassException。

序列化ID必须是final public 的long类型，同时建议是private的。

###toString()方法
序列化和反序列化默认并不会调用对象的toString()方法。

###序列化ID相同，类签名不同依旧会报错。
如果两个类的序列化ID相同，但是类名不同，会报ClassCastException 。

即使是子类关系也不行。