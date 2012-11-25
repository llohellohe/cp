package yangqi.asm;

public class TryCatchOpcodes {
	
	int f;
	
	public void foo(){
		try{
			Thread.sleep(1l);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("ff");
		}
	}
	
	public void foo2(){
		if(f<10){
			System.out.println("ff");
		}else{
			System.out.println("ff");
		}
	}
}
