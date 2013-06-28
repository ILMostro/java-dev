//Recursion: TowerOfHanoi

public class TowerOfHanoi
{
    public static void main(String[] args)
    {
        System.out.println("Moves for 3 disk problem");
        moveDisks(3, 1, 3, 2);
    }

    public static void moveDisks(int count, int needle1,
                                 int needle3, int needle2)
    {
        if (count > 0)
        {
            moveDisks(count-1, needle1, needle2, needle3);
            System.out.println("Move disk " + count
                             + " from needle "
                             + needle1
                             + " to needle " + needle3 + ".");
            moveDisks(count-1, needle2, needle3, needle1);
        }
    }
}