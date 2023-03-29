package main.flyweight;

import java.util.HashMap;
import java.util.Map;

public class GemFactory {

    static Map<String, Gem> gems = new HashMap<>();

    /**
     * Return existing gem with given properties from pool. In case there is no such gem in pool create new one,
     * add to pool and return that gem.
     * @param gemName   - name <=> shape + "_" + color
     * @return gem object with given properties
     */
    public static Gem getGem(String gemName) {
        Gem gem = gems.get(gemName);
        if (gem == null) {
            String shape = gemName.split("_")[0];
            String color = gemName.split("_")[1];
            gem = new Gem(shape, color);
            gems.put(gemName, gem);
        }
        return gems.get(gemName);
    }
}
