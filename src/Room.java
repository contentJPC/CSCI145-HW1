public class Room {
    private boolean visited;

    public boolean getVisited() {
        return this.visited;
    }
    public void setVisited(boolean pVisited) {
        this.visited = pVisited;
    }

    public void enter(Player pPlayer) {
        setVisited(true);
    }

    public boolean hasVisited() {
        return getVisited();
    }
}
