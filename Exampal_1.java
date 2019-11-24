class Base
{
    public void show()
    {
        System.out.println("Base::show() Called");
    }
}

class Derived extends Base
{
    public void show()
    {
        System.out.println("Derived::show() Called");
    }
}

public class Exampal_1
{
    public static void main(String args[])
    {
        Base b = new Derived();
        b.show();
    }
}
