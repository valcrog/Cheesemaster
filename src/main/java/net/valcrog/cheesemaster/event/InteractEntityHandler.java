package net.valcrog.cheesemaster.event;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import net.valcrog.cheesemaster.item.ModItems;
import org.jetbrains.annotations.Nullable;

public class InteractEntityHandler implements UseEntityCallback {
    public ActionResult interact(PlayerEntity player, World world, Hand hand, Entity entity, @Nullable EntityHitResult hitResult) {
        if (entity instanceof SheepEntity && !world.isClient()) {
            ItemStack itemStack = player.getStackInHand(hand);
            if (itemStack.isOf(Items.BUCKET) && !((SheepEntity) entity).isBaby()) {
                player.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
                ItemStack itemStack2 = ItemUsage.exchangeStack(itemStack, player, ModItems.SHEEPS_MILK_BUCKET.getDefaultStack());
                player.setStackInHand(hand, itemStack2);
            }
        }
        return ActionResult.PASS;
    }

}