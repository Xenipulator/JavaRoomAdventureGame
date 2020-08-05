//imports
import java.util.ArrayList;

public class Room 
{
    //fields
    private String Roomname; 
    private String colorOfRoom;//Color of the room
    private ArrayList<Exit> exitList = new ArrayList<Exit>();//list of exits
    private ArrayList<Item> itemList = new ArrayList<Item>();//list of items within the room

    //default constructor
    public Room() 
    {
        this.Roomname = "Room";
        this.colorOfRoom = "White";
    }

    //constructor
    public Room(String roomName, String colorOfRoom)
    {
        this.Roomname = roomName;
        this.colorOfRoom = colorOfRoom;
    }

    //getters
    public String getRoomName()
    {
        return this.Roomname;
    }

    public String getRoomColor()
    {
        return this.colorOfRoom;
    }

    public ArrayList<Exit> getExits()
    {
        return this.exitList;
    }

    public ArrayList<Item> getItemList()
    {
        return this.itemList;
    }

    //setters/adders
    public void setColor(String color)
    {
        this.colorOfRoom = color;
    } 

    public void setName(String name)
    {
        this.Roomname = name;
    }
    
    public void addExit(Exit e)
    {
        this.exitList.add(e);
    } 

    public void addItem(Item enteredItem)
    {
        this.itemList.add(enteredItem);
    } 
}