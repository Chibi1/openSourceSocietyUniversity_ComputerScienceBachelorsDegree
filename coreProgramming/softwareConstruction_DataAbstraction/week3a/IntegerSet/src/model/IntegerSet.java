package model;

public class IntegerSet {


    // MODIFIES: this
    // EFFECTS: inserts num if not already there
    //          if num is there, does nothing
    public void insert(Integer num) { }


    // MODIFIES: this
    // EFFECTS: if the integer is in the integer set, then remove it from the integer set,
    //          Otherwise, do nothing
    public void remove(Integer num) { }

    // EFFECTS: if the integer is contained in the set, return true. Otherwise return false
    public boolean contains(Integer num) { return false; }

    // EFFECTS: returns the size of the set
    public int size() { return 0; }
}
