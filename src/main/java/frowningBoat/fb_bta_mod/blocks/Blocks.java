package frowningBoat.fb_bta_mod.blocks;

import frowningBoat.fb_bta_mod.fb_bta_modConfig;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGlass;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

import static frowningBoat.fb_bta_mod.fb_bta_mod.MOD_ID;

public class Blocks {

	private int blockID(String blockName) {
		return fb_bta_modConfig.cfg.getInt("Block IDs." + blockName);
	}

	public static Block testBlock2;
	public static Block clearGlass;
	public static Block colouredGlass;

	public void initializeBlocks() {
		BlockBuilder testBlock = new BlockBuilder(MOD_ID)
			.setLuminance(0)
			.setBlockSound(BlockSounds.WOOD)
			.setHardness(2)
			.setResistance(25);

		BlockBuilder glass = new BlockBuilder(MOD_ID)
			.setLightOpacity(0)
			.setBlockSound(BlockSounds.GLASS)
			.setHardness(0.35F)
			.setResistance(0.5F);
		testBlock2 = testBlock
			.setTextures("redCross.png")
			.build(new BlockGlass("testBlock2", blockID("testBlock2"), Material.wood, false).withTags(BlockTags.MINEABLE_BY_AXE));

		clearGlass = glass
			.setTextures("clearGlass.png")
			.build(new BlockGlass("clearGlass",blockID("clearGlass"), Material.glass, false));

		colouredGlass = glass
			.setTextures("whiteGlass.png").setTextures("lightGrayGlass.png").setTextures("grayGlass.png").setTextures("blackGlass.png")
			.setTextures("redGlass.png").setTextures("orangeGlass.png").setTextures("yellowGlass.png").setTextures("lightBlueGlass.png")
			.setTextures("blueGlass.png").setTextures("purpleGlass.png").setTextures("brownGlass.png").setTextures("magentaGlass.png")
			.setTextures("greenGlass.png").setTextures("pinkGlass.png").setTextures("cyanGlass.png").setTextures("limeGlass.png")
			.build(new BlockColouredGlass("colouredGlass", blockID("colouredGlass"), Material.glass, false));
	}
}
