package com.remodstudios.foodstuffs.blocks;

import com.remodstudios.foodstuffs.fs_main;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    // Blocks


    // Methods
    private static Block register(Block block, String name) {
        return Registry.register(Registry.BLOCK, new Identifier(fs_main.MOD_ID, name), block);
    }

    public static void init() {
        // just loads the class
    }
}
