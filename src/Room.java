/**
 * Created by cormiej on 1/23/19.
 */
public class Room {
    private boolean visited = false;

    private boolean getVisited() {
        return this.visited;
    }
    private void setVisited(boolean pVisited) {
        this.visited = pVisited;
    }

    public void enter(Player pPlayer) {
        setVisited(true);
    }

    public boolean visited() {
        return getVisited();
    }
}
