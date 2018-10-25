import java.util.List;

public abstract class MazeSolver {
	
	protected Maze maze;
	private boolean solvable ;
	private boolean solved ;
	MazeSolver(Maze maze)
	{
		this.maze = maze;
		this.makeEmpty();
		if(maze != null)
		{
			this.add(maze.getStart());
			
		solvable = true;
		solved = false;
	}
	}
	abstract void makeEmpty();
	abstract boolean isEmpty();
	abstract void add(Square s);
	abstract Square next();
	
	boolean isSolved()
	{
		
		return solved;
	}
	
	public boolean isSolvable()
	{
		return solvable;
		
	}
	public void Step()
	{
		if(isSolved())
		{
			solved =true;
			solvable = false;
			return;
		}
		
		Square s = this.next();
		if(maze.getExit().equals(s))
		{
			solvable = true;
			solved = true;
			return;
		}
		//adding the neighbors to the worklist
		List<Square> neighbors = maze.getNeighbors(s);
		//System.out.println(neighbors);
		for(int i = 0; i < neighbors.size(); i++){
			if((neighbors.get(i).getType() != Square.WALL && neighbors.get(i).getStatus()==Square.UNKNOWN) || neighbors.get(i).getType() == Square.EXIT){
				neighbors.get(i).setStatus(Square.WORKING);
				this.add(neighbors.get(i));
			}
			s.setStatus(Square.EXPLORED);
		}
		
		
		
	}
	public String getPath()
	{
		
		if(this.solved && this.solvable)
			return "maze solved!";
		else if (!this.solvable)
			return "this has no solution!";
		else
			return "maze not yet solved";
	}
	public void reset()
	{
		this.makeEmpty();
		this.add(this.maze.getStart());
		this.solved = false;
		this.solvable = true;
		this.maze.reset();//removes maze markings;
	}
	public void solve()
	{
		while(solved != true)
			this.Step();
	}
	
	
}
