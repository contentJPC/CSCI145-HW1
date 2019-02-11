public class DungeonMap {
    private Room[][] rooms = new Room[5][5];
    private Player player = new Player(1,1,1,"Placeholder",1); //??????????????????????????????????????????????? dunno yet

    public DungeonMap(int pRows, int pColumns) {
        for (int i=0;i<rooms[0].length;i++) {
            for (int j=0;j<rooms[1].length;j++) {
                rooms[i][j] = new Room();
            }
        }
    }

    public void print() {
        int counter = 0;
        System.out.println("+-----+");
        for (int i=0;i<rooms[0].length;i++) {
            for (int j = 0;j<rooms[1].length;j++) {
                if (counter == 0) {
                    System.out.print("|");
                }
                counter = counter+1;
                if (rooms[i][j].hasVisited() == true) {
                    System.out.print("*");
                }
                else if (rooms[i][j].hasVisited() == false) {
                    System.out.print(".");
                }
                if (counter == 5) {
                    System.out.println("|");
                }
            }
            counter = 0;
        }
        System.out.println("+-----+");
    }
}