/**
 * Created by cormiej on 1/23/19.
 */
public class Room {
    private boolean visited = false;

    public boolean getVisited() {
        return this.visited;
    }
    public void setVisited(boolean pVisited) {
        this.visited = pVisited;
    }

    public void enter(Player pPlayer) {
        setVisited(true);
    }

    public boolean visited() {
        return getVisited();
    }
}
