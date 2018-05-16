
@FunctionalInterface
interface MyFunction1 { // 함수형 인터페이스 생성
	public abstract void run();
}

class LamdaEx1 {

	public static void main(String[] args) {
		MyFunction1 f1 = () -> System.out.println("f1.run()");	// 객체 생성과 동시에 초기화
		MyFunction1 f2 = new MyFunction1() {						// 객체 생성과 동시에 초기화(run 구현)
			public void run() {
				System.out.println("f2.run()");
			}
		};
		MyFunction1 f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run"));
	}
	
	public static void execute(MyFunction1 f) { 	// 메서드 호출
		f.run();								// MyFunction f = () -> System.out.println("run"));
	}
	
	public static MyFunction1 getMyFunction() {				
		MyFunction1 f = () -> System.out.println("f3.run()");
		return f;
	}
	
}

