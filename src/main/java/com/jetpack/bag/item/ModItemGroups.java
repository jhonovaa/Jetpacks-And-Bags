package com.jetpack.bag.item;

import com.jetpack.bag.JetpacksandBags;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab JETPACKS_AND_BAGS_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            JetpacksandBags.id("jetpacksandbags_group"),
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemgroup.jetpacksandbags"))
                    .icon(() -> new ItemStack(ModItems.JETPACK))
                    .displayItems((displayContext, entries) -> {
                        entries.accept(ModItems.JETPACK);
                        entries.accept(ModItems.BACKPACK);
                    })
                    .build()
    );

    public static void registerItemGroups() {
        JetpacksandBags.LOGGER.info("Registering Item Groups for " + JetpacksandBags.MOD_ID);
    }
}
