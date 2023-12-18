interface Prioritizeable {
    int MAX_PRIORITY = 10, MIN_PRIORITY = 0;
    public abstract int getPriority();
    public abstract void setPriority(int p);
}
