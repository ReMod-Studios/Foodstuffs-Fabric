package com.remodstudios.foodstuffs.items;

import com.remodstudios.foodstuffs.blocks.FSBlockRegistry;
import com.remodstudios.foodstuffs.fs_main;
import com.remodstudios.yarnandneedles.items.ItemRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FSItemRegistry extends ItemRegistry {
    public static final FSItemRegistry INSTANCE = new FSItemRegistry();

    private static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier(fs_main.MOD_ID,"group"), () -> new ItemStack(FSItemRegistry.SWEET_BREAD));

    // Items go here
//    public static final Item HONEY_MELON = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(4f).build())), "honey_melon");
//    public static final Item HONEY_PIE = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(10).saturationModifier(7f).build())), "honey_pie");
//    public static final Item SWEET_BREAD = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(4f).build())), "sweet_bread");
//    public static final Item SWEETBERRY_PIE = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(5f).build())), "sweetberry_pie");
//
//    public static final Item SALT_CHUNKS = register(new Item(new Item.Settings().group(GROUP)), "salt_chunks");
//    public static final Item PRETZEL = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(5F).build())), "pretzel");
//
//    public static final Item PEAR = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(2.4F).build())), "pear");
//    public static final Item SILVER_PEAR = register(new Item(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(2.4F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 2), 1F).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 400), 1F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400,1), 1F).build())), "silver_pear");
//
//    public static final Item EMPTY_JAR = register(new JarItem(new Item.Settings().group(GROUP)), "empty_jar");
//    public static final Item SWEETBERRY_JAM = register(new JarItem(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(5f).build())), "sweetberry_jam");
//    public static final Item PICKLED_CARROT = register(new JarItem(new Item.Settings().group(GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(6F).build())), "pickled_carrot");
//
//    // BlockItems go here
//    public static final Item SALT_ORE = register(FSBlockRegistry.SALT_ORE, "salt_ore", new Item.Settings().group(GROUP));
//    public static final Item SALT_BLOCK = register(FSBlockRegistry.SALT_BLOCK, "salt_block", new Item.Settings().group(GROUP));

    public FSItemRegistry() {
        super(fs_main.MOD_ID);
    }

    ////////////


    // Methods
    private static Item register(Item item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(fs_main.MOD_ID, name), item);
    }

    private static Item register(Block block, String name, Item.Settings settings) {
        return register(new BlockItem(block, settings), name);
    }
}