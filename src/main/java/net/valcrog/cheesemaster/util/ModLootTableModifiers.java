package net.valcrog.cheesemaster.util;


import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.valcrog.cheesemaster.item.ModItems;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier COW_ID =
            new Identifier("minecraft", "entities/cow");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(source.isBuiltin() && COW_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.33f))
                        .with(ItemEntry.builder(ModItems.RENNET_BAG));

                tableBuilder.pool(poolBuilder);
            }
        }));
    }
}
