package family;

public class Father extends Family implements Job{
	public Father() {
	}
	public Father(String name) {
		super(name);
	}
	@Override
	public String work() {
		return "아빠는 나가서 일을한다\n";
	}
	@Override
	public String toString() {
		return super.toString()+work();
	}
}
