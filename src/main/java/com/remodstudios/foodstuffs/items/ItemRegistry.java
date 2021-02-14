package com.remodstudios.foodstuffs.items;

import com.remodstudios.foodstuffs.fs_main;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    private static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier(fs_main.MOD_ID,"group"), () -> new ItemStack(ItemRegistry.SUGAR_BREAD));

    // Items go here
    public static final Item HONEY_MELON = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(4f).build())), "honey_melon");
    public static final Item SUGAR_BREAD = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(4f).build())), "sugar_bread");
    public static final Item SWEETBERRY_JAM = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(5f).build())), "sweetberry_jam");
    public static final Item SWEETBERRY_PIE = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(5f).build())), "sweetberry_pie");
    public static final Item HONEY_PIE = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(7f).build())), "honey_pie");
    public static final Item SALT_CHUNKS = register(new Item(new Item.Settings().group(GROUP)), "salt_chunks");
    public static final Item EMPTY_JAR = register(new Item(new Item.Settings().group(GROUP)), "empty_jar");


    // BlockItems go here


    ////////////


    // Methods
    public static void init () {
        // Loads Class(TM)
    }
    private static Item register(Item item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(fs_main.MOD_ID, name), item);
    }

    private static Item register(Block block, String name, Item.Settings settings) {
        return register(new BlockItem(block, settings), name);
    }
}