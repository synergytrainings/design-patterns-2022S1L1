package model;

import java.util.List;

public class Locker {


    private final int id;
    private final String name;
    private final int capacity;
    private String companyName;
    private final List<Integer> slots;
    private boolean status;

    public Locker(int id, String name, int capacity, List<Integer> slots) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.slots = slots;
    }

    public void setConfig(Config config) {
        this.companyName = config.getCompanyName();
        this.status = config.isStatus();
    }

    /**
     * Getting item from slot if exist, else printing message
     *
     * @param slotId: must be in range of locker's capacity
     * @return boolean info that item was given or not
     */
    public boolean getItemFromSlot(int slotId) {
        if (!this.status) {
            throw new RuntimeException("Locker's status is off");
        }
        if (slotId > capacity - 1 || slotId < 0) {
            throw new IndexOutOfBoundsException("Slot id must be in capacity range");
        }

        if (slots.contains(slotId)) {
            System.out.println(String.format("Here is your item, thanks for choosing us '%s' team.", companyName));
            // method call for open locker
            slots.remove((Integer) slotId);
            return true;
        } else {
            System.out.println(String.format("Oops, there are not any item in this slot, please contact to locker company '%s'", companyName));
            return false;
        }
    }

    public boolean getStatus() {
        return status;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Integer> getSlots() {
        return slots;
    }
}
