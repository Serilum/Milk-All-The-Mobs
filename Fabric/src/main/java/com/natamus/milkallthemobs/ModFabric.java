package com.natamus.milkallthemobs;

import com.natamus.collective.check.RegisterMod;
import com.natamus.milkallthemobs.events.MilkEvent;
import com.natamus.milkallthemobs.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			return MilkEvent.onEntityInteract(player, world, hand, entity, hitResult);
		});
	}

	private static void setGlobalConstants() {

	}
}
