package main.flyweight;

public class GemOnBoard {

    private Gem gem;
    private int raw;
    private int column;

    public GemOnBoard(Gem gem, int raw, int column) {
        this.gem = gem;
        this.raw = raw;
        this.column = column;
    }

    public void draw(Board board) {
        gem.draw(board, raw, column);
    }

    public Gem getGem() {
        return gem;
    }

    public void setGem(Gem gem) {
        this.gem = gem;
    }

    public int getRaw() {
        return raw;
    }

    public void setRaw(int raw) {
        this.raw = raw;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
