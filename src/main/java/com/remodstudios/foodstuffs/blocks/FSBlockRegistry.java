package com.remodstudios.foodstuffs.blocks;

import com.remodstudios.foodstuffs.fs_main;
import com.remodstudios.yarnandneedles.blocks.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.block.Blocks.*;

public class FSBlockRegistry extends BlockRegistry {
    public static final FSBlockRegistry INSTANCE = new FSBlockRegistry();

//    // Blocks
//    public static final Block SALT_ORE = register(new Block(FabricBlockSettings.copyOf(IRON_ORE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0)), "salt_ore");
//    public static final Block SALT_BLOCK = register(new Block(FabricBlockSettings.copyOf(IRON_BLOCK).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0)), "salt_block");

    public FSBlockRegistry() {
        super(fs_main.MOD_ID);
    }

    // Methods
    private static Block register(Block block, String name) {
        return Registry.register(Registry.BLOCK, new Identifier(fs_main.MOD_ID, name), block);
    }
}
