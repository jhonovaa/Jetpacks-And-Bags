package com.jetpack.bag.item;

import com.jetpack.bag.JetpacksandBags;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

public class ModItems {
    
    // Nuestro Item de Jetpack Básico
    public static final Item JETPACK = registerItem("jetpack", new Item(new Item.Properties().stacksTo(1)));
    
    // Nuestro Item de Mochila Básica
    public static final Item BACKPACK = registerItem("backpack", new Item(new Item.Properties().stacksTo(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, JetpacksandBags.id(name), item);
    }

    public static void registerModItems() {
        JetpacksandBags.LOGGER.info("Registering Mod Items for " + JetpacksandBags.MOD_ID);
    }
}
