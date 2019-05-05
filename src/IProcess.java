import java.rmi.Remote;

public interface IProcess extends Remote{
	public void startElection();
	public void setLeader(IProcess leader);
	public long getPID();
	public boolean keepAlive();
	
}
