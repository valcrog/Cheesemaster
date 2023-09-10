package net.valcrog.cheesemaster.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.MilkBucketItem;
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

    public static final Item RENNET_BAG = registerItem("rennet_bag",
            new Item(new FabricItemSettings().group(ModItemGroup.CHEESEMASTER)));

    public static final Item SHEEPS_MILK_BUCKET = registerItem("sheeps_milk_bucket",
            new MilkBucketItem(new FabricItemSettings().group(ModItemGroup.CHEESEMASTER).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Cheesemaster.MOD_ID, name), item);
    }

    public static void registerModItems() {

    }
}
