package com.remodstudios.foodstuffs;

import com.remodstudios.foodstuffs.blocks.BlockRegistry;
import com.remodstudios.foodstuffs.items.ItemRegistry;
import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fs_main implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "foodstuffs";
    public static final String MOD_NAME = "Foodstuffs";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        //TODO: Initializer
        ItemRegistry.init();
        BlockRegistry.init();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}