package net.sba.aigenmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.sba.aigenmod.AigenMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GREEN_STICK = registerItem("green_stick", new Item(new Item.Settings()));
    public static final Item BANANA = registerItem("banana", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AigenMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AigenMod.LOGGER.info("Registering Mod Items for " + AigenMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GREEN_STICK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(BANANA);
        });
    }
}