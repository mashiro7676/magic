
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.magic.item.InfinityRodItem;
import net.mcreator.magic.MagicMod;

public class MagicModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicMod.MODID);
	public static final RegistryObject<Item> INFINITY_ROD = REGISTRY.register("infinity_rod", () -> new InfinityRodItem());
}