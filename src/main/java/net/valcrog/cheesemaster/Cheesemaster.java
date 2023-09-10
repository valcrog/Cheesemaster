package net.valcrog.cheesemaster;

import net.fabricmc.api.ModInitializer;
import net.valcrog.cheesemaster.item.ModItems;

public class Cheesemaster implements ModInitializer {
    public static final String MOD_ID = "cheesemaster";
    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
