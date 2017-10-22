package interpreter;
public class RepeatCommandNode implements Node{
	private int number;
	private Node commandListNode;
	public void parse(Context context){
		context.skipToken("REPEAT");
		number = context.currentNumber();
		context.nextToken();
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}
	public void execute(){
		for(int i=0;i<number;i++)
			commandListNode.execute();
	}
	public String toString(){
		return "[REPEAT "+number + "" + commandListNode +"]";
	}
}
