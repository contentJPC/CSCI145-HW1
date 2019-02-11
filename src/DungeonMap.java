public class DungeonMap {
    private Room[][] rooms;
    private Player player;

    public DungeonMap(int pRows, int pColumns, Player pPlayer) {
        this.player = pPlayer;
        rooms = new Room[pRows][pColumns];
        for (int i=0;i<rooms.length;i++) {
            for (int j=0;j<rooms[i].length;j++) {
                rooms[i][j] = new Room();
            }
        }
        rooms[player.getXCoord()][player.getYCoord()].setVisited(true);
    }

    public void print() {
        int counter = 0;
        printTopAndBot();
        for (int i=0;i<rooms.length;i++) {
            for (int j = 0;j<rooms[1].length;j++) {
                if (counter == 0) {
                    System.out.print("|");
                }
                counter = counter+1;
                //if (i == playerX && j == playerY) {
                if (i == player.getXCoord() && j == player.getYCoord()) {
                    if (player.getPlayerClass().equals("Warrior")){
                        System.out.print(" W ");
                    }
                    else if (player.getPlayerClass().equals("Thief")){
                        System.out.print(" T ");
                    }
                }
                else if (rooms[i][j].hasVisited() == true) {
                    System.out.print(" * ");
                }
                else if (rooms[i][j].hasVisited() == false) {
                    System.out.print("   ");
                }
                if (counter == rooms[0].length) {
                    System.out.println("|");
                }
            }
            counter = 0;
        }
        printTopAndBot();
    }

    private void printTopAndBot() {
        System.out.print("+");
        for (int i=0;i<rooms[1].length;i++) {
            System.out.print(" - ");
        }
        System.out.println("+");
    }

    public void enterRoom(Player pPlayer) {
        rooms[pPlayer.getXCoord()][pPlayer.getYCoord()].enter(pPlayer);
    }
}