package com.sakyrhythm.ice_fire.entity;

import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DefaultedRegistry<T> extends Registry<T> {
	@NotNull
	@Override
	Identifier getId(T value);

	@NotNull
	@Override
	T get(@Nullable Identifier id);

	@NotNull
	@Override
	T get(int index);

	Identifier getDefaultId();
}
