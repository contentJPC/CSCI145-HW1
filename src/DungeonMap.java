public class DungeonMap {
    private Room[][] rooms = new Room[5][5];
    private Player player = new Player(1,1,1,"Placeholder",1); //??????????????????????????????????????????????? dunno yet

    public void DungeonMap(int pRows, int pColumns) {
        for (int i=0;i<rooms[0].length;i++) {
            for (int j=0;j<rooms[1].length;j++) {
                rooms[i][j] = new Room();
            }
        }
    }

    public void print() {
        // if (rooms[i][j].hasVisited()) { isn't working and I'm not sure why
        for (int i=0;i<rooms[0].length;i++) {
            for (int j = 0;j<rooms[1].length;j++) {
                if (rooms[i][j].hasVisited()) {
                    System.out.println("*");
                }
                else if (rooms[i][j].hasVisited()) {
                    System.out.println(".");
                }
            }
        }
    }
}