package com.natamus.milkallthemobs.neoforge.events;

import com.natamus.milkallthemobs.events.MilkEvent;
import net.minecraft.world.InteractionResult;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeMilkEvent {
	@SubscribeEvent
	public static void onEntityInteract(PlayerInteractEvent.EntityInteract e) {
		if (MilkEvent.onEntityInteract(e.getEntity(), e.getLevel(), e.getHand(), e.getTarget(), null).equals(InteractionResult.SUCCESS)) {
			e.setCancellationResult(InteractionResult.SUCCESS);
		}
	}
}
