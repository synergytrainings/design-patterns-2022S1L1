import java.util.Iterator;

class ToDoItem {
    private final String description;

    public ToDoItem(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class ToDoCollection {
    static final int LIMIT = 10;
    int numberOfToDo = 0;
    ToDoItem[] toDoItems;

    public ToDoCollection() {
        this.toDoItems = new ToDoItem[LIMIT];
        add("First");
        add("Second");
        add("Third");
    }

    public void add(String description) {
        ToDoItem toDoItem = new ToDoItem(description);
        if (numberOfToDo >= LIMIT)
            System.err.println("FULL");
        else {
            toDoItems[numberOfToDo++] = toDoItem;
        }
    }

    public Iterator<ToDoItem> getIterator() {
        return new ToDoIterator(this.toDoItems);
    }
}

class ToDoIterator implements Iterator<ToDoItem> {

    ToDoItem[] toDoItems;
    int index = 0;

    public ToDoIterator(ToDoItem[] toDoItems) {
        this.toDoItems = toDoItems;
    }

    @Override
    public boolean hasNext() {
        return index < toDoItems.length &&
                toDoItems[index] != null;
    }

    @Override
    public ToDoItem next() {
        return toDoItems[index++];
    }
}

public class IteratorDesign {
    private static final ToDoCollection toDoCollection = new ToDoCollection();

    public static void main(String[] args) {
        Iterator<ToDoItem> iterator = toDoCollection.getIterator();
        while (iterator.hasNext()) {
            ToDoItem toDoItem = iterator.next();
            System.out.println(toDoItem.getDescription());
        }
    }
}
