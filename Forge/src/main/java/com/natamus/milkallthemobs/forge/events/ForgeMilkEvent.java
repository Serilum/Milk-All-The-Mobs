package com.natamus.milkallthemobs.forge.events;

import com.natamus.milkallthemobs.events.MilkEvent;
import net.minecraft.world.InteractionResult;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeMilkEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeMilkEvent.class);

		PlayerInteractEvent.EntityInteract.BUS.addListener(ForgeMilkEvent::onEntityInteract);
	}

	@SubscribeEvent
	public static void onEntityInteract(PlayerInteractEvent.EntityInteract e) {
		if (MilkEvent.onEntityInteract(e.getEntity(), e.getLevel(), e.getHand(), e.getTarget(), null).equals(InteractionResult.SUCCESS)) {
			e.setCancellationResult(InteractionResult.SUCCESS);
		}
	}
}
