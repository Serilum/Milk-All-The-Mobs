package com.natamus.milkallthemobs.forge.events;

import com.natamus.milkallthemobs.events.MilkEvent;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeMilkEvent {
	@SubscribeEvent
	public void onEntityInteract(PlayerInteractEvent.EntityInteract e) {
		if (MilkEvent.onEntityInteract(e.getPlayer(), e.getWorld(), e.getHand(), e.getTarget(), null).equals(InteractionResult.SUCCESS)) {
			e.setCancellationResult(InteractionResult.SUCCESS);
		}
	}
}
