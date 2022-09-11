package Class_and_objects;
public class blueprint_of_class
{
    public static void main(String[] args)
    {
        Queen q=new Queen();
        Rook r=new Rook();
        Pawn p=new Pawn();
        q.moves();
        r.moves();
        p.moves();
    }
}
interface ChessPlayer
{
    void moves();
}
class Queen implements ChessPlayer
{
    public void moves()  //if you don't write public before moves() it becomes default type
    {
        System.out.println("all directions");
    }
}
class Rook implements ChessPlayer
{
    public void moves()  //if you don't write public before moves() it becomes default type
    {
        System.out.println("left,right");
    }
}
class Pawn implements ChessPlayer
{
    public void moves()  //if you don't write public before moves() it becomes default type
    {
        System.out.println("front");
    }
}
