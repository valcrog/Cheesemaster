package net.valcrog.cheesemaster.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.valcrog.cheesemaster.Cheesemaster;

public class ModItems {
    public static final Item CHEESEMAKERS_HAT = registerItem("cheesemakers_hat",
            new ArmorItem(ModArmorMaterials.CHEESEMAKER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.CHEESEMASTER)));
    public static final Item CHEESEMAKERS_APRON = registerItem("cheesemakers_apron",
            new ArmorItem(ModArmorMaterials.CHEESEMAKER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.CHEESEMASTER)));
    public static final Item CHEESEMAKERS_PANTS = registerItem("cheesemakers_pants",
            new ArmorItem(ModArmorMaterials.CHEESEMAKER, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.CHEESEMASTER)));
    public static final Item CHEESEMAKERS_BOOTS = registerItem("cheesemakers_boots",
            new ArmorItem(ModArmorMaterials.CHEESEMAKER, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.CHEESEMASTER)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Cheesemaster.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Cheesemaster.LOGGER.info("Registering mod items for " + Cheesemaster.MOD_ID);
    }
}
