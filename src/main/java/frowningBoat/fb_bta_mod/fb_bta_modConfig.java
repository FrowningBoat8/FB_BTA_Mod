package frowningBoat.fb_bta_mod;

import frowningBoat.fb_bta_mod.blocks.Blocks;
import net.minecraft.core.block.Block;
import turniplabs.halplibe.util.ConfigUpdater;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class fb_bta_modConfig {
	public static ConfigUpdater updater = ConfigUpdater.fromProperties();
	private static final Toml properties = new Toml("fb_bta_mod TOML Config");
	public static TomlConfigHandler cfg;

	private static int blockIDs = 1200;

	private static int itemIDs = 16550;

	static {
		properties.addCategory("FB_BTA_MOD")
			.addEntry("cfgVersion", 1);

		properties.addCategory("Block IDs");
		properties.addEntry("Block IDs.startingID", 1200);
		properties.addCategory("Item IDs");
		properties.addEntry("Item IDs.startingID", 16350);


		List<Field> blockFields = Arrays.stream(Blocks.class.getDeclaredFields()).filter((F)-> Block.class.isAssignableFrom(F.getType())).collect(Collectors.toList());
		for (Field blockField : blockFields) {
			properties.addEntry("Block IDs." + blockField.getName(), blockIDs++);
		}
		/*
		List<Field> itemFields = Arrays.stream(BonusItems.class.getDeclaredFields()).filter((F)-> Item.class.isAssignableFrom(F.getType())).collect(Collectors.toList());
		for (Field itemField : itemFields) {
			properties.addEntry("Item IDs." + itemField.getName(), itemIDs++);
		}*/

		cfg = new TomlConfigHandler(updater, fb_bta_mod.MOD_ID, properties);

	}
}
