import java.util.*;

public class GameState {
	int score;
	int trashCount;
	int mittenCount;
	int blueCount;
	final static int frameWidth = 1000;
	final static int crabUpperBound = 200;
	final static int crabLowerBound = 800;
    final static int frameHeight = 1000;
	Collection<GameObject> gameObjectCollection = new LinkedList<GameObject>();
	
	
	
	public void update()
	{
		for (GameObject gameObject : gameObjectCollection)
		{
			gameObject.updatePosition();
		}
		for (GameObject gameObject : gameObjectCollection)
		{
			gameObject.updateState();
		}

	}
	public void addToScore(int value)
	{
		this.score += value;
	}
	public void addToTrashCount(int value)
	{
		this.trashCount += value;
	}
	public void addToMittenCount(int value)
	{
		this.mittenCount += value;
	}
	public void addToBlueCount(int value)
	{
		this.blueCount += value;
	}
	public void add(GameObject gameObject)
	{
		this.gameObjectCollection.add(gameObject);
	}
	public void remove(GameObject gameObject)
	{
		this.gameObjectCollection.remove(gameObject);
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getTrashCount() {
		return trashCount;
	}
	public void setTrashCount(int trashCount) {
		this.trashCount = trashCount;
	}
	public int getMittenCount() {
		return mittenCount;
	}
	public void setMittenCount(int mittenCount) {
		this.mittenCount = mittenCount;
	}
	public int getBlueCount() {
		return blueCount;
	}
	public void setBlueCount(int blueCount) {
		this.blueCount = blueCount;
	}
	public Collection<GameObject> getGameObjectCollection() {
		return gameObjectCollection;
	}
	
	@Override
	public String toString() {
		return "\nGameState [score=" + score + ", trashCount=" + trashCount + ", mittenCount=" + mittenCount
				+ ", blueCount=" + blueCount + ", gameObjectCollection=" + gameObjectCollection + "]";
	}
	

}
