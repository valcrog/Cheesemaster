package net.valcrog.cheesemaster.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.valcrog.cheesemaster.Cheesemaster;

public class ModItemGroup {
    public static final ItemGroup CHEESEMASTER = FabricItemGroupBuilder.build(new Identifier(Cheesemaster.MOD_ID, "cheesemaster"),
            () -> new ItemStack(ModItems.CHEESEMAKERS_HAT));
}
