package com.remodstudios.foodstuffs.client;

import com.remodstudios.foodstuffs.blocks.FSBlockRegistry;
import com.remodstudios.foodstuffs.fs_main;
import com.remodstudios.foodstuffs.items.FSItemRegistry;
import com.swordglowsblue.artifice.api.Artifice;
import net.fabricmc.api.ClientModInitializer;

import java.io.IOException;

public class fs_client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Artifice.registerAssetPack(fs_main.id("artifice_rp"), pack -> {
            FSItemRegistry.INSTANCE.generateAssets(pack);
            FSBlockRegistry.INSTANCE.generateAssets(pack);

            try {
                pack.dumpResources("artifice.dbg", "assets");
            } catch (IOException ioe) {
                fs_main.LOGGER.error("BRUH! Artifice failed to dump!");
                ioe.printStackTrace();
            }
        });
    }
}