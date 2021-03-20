package com.remodstudios.foodstuffs;

import com.remodstudios.foodstuffs.blocks.FSBlockRegistry;
import com.remodstudios.foodstuffs.items.FSItemRegistry;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fs_main implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "foodstuffs";
    public static final String MOD_NAME = "Foodstuffs";
    public static Identifier id(String path) { return new Identifier(MOD_ID, path); }

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        //TODO: Initializer
        FSItemRegistry.INSTANCE.init();
        FSBlockRegistry.INSTANCE.init();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}