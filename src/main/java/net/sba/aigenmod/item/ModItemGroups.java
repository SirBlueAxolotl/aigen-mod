package net.sba.aigenmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.sba.aigenmod.AigenMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sba.aigenmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup AIGEN_MOD = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AigenMod.MOD_ID, "aigen_mod"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BANANA))
                    .displayName(Text.translatable("itemgroup.aigen-mod.aigen_mod"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BANANA);
                        entries.add(ModBlocks.BANANA_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        AigenMod.LOGGER.info("Registering Item Groups for " + AigenMod.MOD_ID);
    }
}
