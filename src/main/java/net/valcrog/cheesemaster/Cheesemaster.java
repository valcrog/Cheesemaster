package net.valcrog.cheesemaster;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Cheesemaster implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogManager().getLogger("cheesemaster");
    public static final String MOD_ID = "cheesemaster";
    @Override
    public void onInitialize() {
        LOGGER.info("Hello world!");
    }
}
