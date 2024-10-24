package net.earthshine17.earthshine.event;

import net.earthshine17.earthshine.ESMod;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

import java.util.Map;

@EventBusSubscriber(modid = ESMod.MOD_ID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class OnBookToVillagerEvent {

    @SubscribeEvent
    public static void onPlayerInteractWithVillager(PlayerInteractEvent.EntityInteract event) {
        // Check if the entity clicked is a villager and the player is holding a book in their main hand
        if (event.getTarget() instanceof Villager && event.getEntity() instanceof Player player) {
            ItemStack heldItem = player.getMainHandItem();

            // Check if the item in hand is a book
            if (heldItem.getItem() == Items.BOOK) {
                // Create a new enchanted book
                ItemStack pickaxe = new ItemStack(Items.DIAMOND_PICKAXE);

                pickaxe.enchant(toHolder(Enchantments.FORTUNE, event.getLevel()), 3);
                // Add the Fortune III enchantment to the book

                // Add the enchanted book to the player's inventory
                if (!player.getInventory().add(pickaxe)) {
                    // If the player's inventory is full, drop the item on the ground
                    player.drop(pickaxe, false);
                }

                //event.getTarget(). (event.getEntity()., 5)

                // Remove one regular book from the player's hand
                //heldItem.shrink(1);

                // Send a message to the player
                player.sendSystemMessage(Component.literal("You have received a Fortune III book from the villager!"));
                return;
            }
        }
    }

    public static Holder<Enchantment> toHolder(ResourceKey<Enchantment> r, Level level) {
        return level.registryAccess().registry(Registries.ENCHANTMENT).get().getHolderOrThrow(r);
    }
}