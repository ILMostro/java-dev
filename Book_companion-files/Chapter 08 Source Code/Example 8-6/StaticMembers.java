//StaticMembers

public class StaticMembers
{
    public static void main(String[] args)
    {
        Illustrate illusObject1 = new Illustrate(3);      //Line 1
		Illustrate illusObject2 = new Illustrate(5);      //Line 2

        Illustrate.incrementY();
		Illustrate.count++;

        System.out.println(illusObject1);
        System.out.println(illusObject2);

        Illustrate.count++;
        System.out.println(illusObject1);
		System.out.println(illusObject2);
    }
}
