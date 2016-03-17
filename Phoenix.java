public class Phoenix extends Animal implements Flying, Walking
{
    private String toy;
    
    public Phoenix()
    {
        super("Fawks", "Too all that dream, and all that dear To see the beauty of land, sea and air Nothing shall ye ever spy As wondrous as the Phoenix in the sky Too all think, and all that ponder. The ways of things on this place we wonder. The one thing ye shall never know. Is: To what home does the Phoenix go? Too all that pray, and believe in too Avá merciful, pure and true. A brighter sign there shall never be. Then the mighty Phoenix over the sea. Too all that live a life of good. Your deeds of love will come back; as they should. A happy life shall be yours to take away. When the Phoenix comes with the break of day. Too all that walk the path of dark. My next words ye would do well to mark. For your deeds of evil ye shall be burnt in flame. And your actions shall be meet with untold of pain. To Human, Elf, Dwarf and all. To every creature great and small. The Phoenix is many things; in future now and history. And though every person has their say, The Phoenix stays a mystery");
        toy = "The Immortal Flame.";
    } 
    
    @Override
    public String eat()
    {
        return "Dragons! 'Hey Ted! Check the storage for Dragon Meat!'";
    }
    
    public String walk()
    {
        return "The phoenix lands and waddles around.";
    }
    
    public String fly()
    {
        return "The phoenix takes off and soars majesticly";
    }
    
    @Override
    public String play()
    {
        return "The phoenix plays with " + toy + ".";
    }
    
    @Override
    public String makeNoise()
    {
        return "Caw! Caw! 'Beautiful ain't it'";
    }
}
