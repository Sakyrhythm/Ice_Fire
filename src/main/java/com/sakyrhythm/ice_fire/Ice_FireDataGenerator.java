package com.sakyrhythm.ice_fire;

import com.sakyrhythm.ice_fire.datagen.ModBlockTagsProvider;
import com.sakyrhythm.ice_fire.datagen.ModENUSLanProvider;
import com.sakyrhythm.ice_fire.datagen.ModItemTagsProvider;
import com.sakyrhythm.ice_fire.datagen.ModModelsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Ice_FireDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelsProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModENUSLanProvider::new);
		pack.addProvider(ModItemTagsProvider::new);
	}
}
