package yangqi.hotspot.classlifecycle;

public class People extends Creature {

    private String name;

    private int    age;
    
    private String school;
    
    private int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    
    public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
    public String toString() {
        return "People [name=" + name + ", age=" + age + "]";
    }

    public void speak() {
        System.out.println("I say hello");
    }
    
    public void test(int a,String s1,int b,String s2,int c,int d ,int e){
    	this.age=a;
    	this.age=b;
    	this.age=c;
    	this.age=d;
    	this.phone=e;
    	this.name=s1;
    	this.school=s2;
    }

}
