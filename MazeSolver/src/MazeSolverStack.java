
public class MazeSolverStack extends MazeSolver {

	private MyStack WorkList;
	
	
	public MazeSolverStack(Maze maze) {
		super(maze);
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	void makeEmpty() {
		// TODO Auto-generated method stub
		WorkList = new MyStack();
		
	}

	@Override
	boolean isEmpty() {
		// TODO Auto-generated method stub
		return WorkList.isEmpty();
	}

	@Override
	void add(Square s) {
		// TODO Auto-generated method stub
		WorkList.push(s);  
		System.out.println(WorkList);
	}

	@Override
	Square next() {
		// TODO Auto-generated method stub
		return WorkList.pop();
	}

}
