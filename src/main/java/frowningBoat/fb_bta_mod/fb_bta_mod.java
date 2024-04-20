package frowningBoat.fb_bta_mod;

import frowningBoat.fb_bta_mod.blocks.Blocks;
import frowningBoat.fb_bta_mod.items.blocks.ItemColouredGlass;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeRegistry;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.CreativeHelper;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import net.minecraft.core.block.*;


public class fb_bta_mod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "fb_bta_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
    public void onInitialize() {
        LOGGER.info("fb_bta_mod initialized.");

		new Blocks().initializeBlocks();

		Registries.RECIPES = new RecipeRegistry();

		RecipeBuilder.Furnace(MOD_ID).setInput(Block.glass).create("clear_glass", Blocks.clearGlass.getDefaultStack());

		Registries.ITEM_GROUPS.register("fb_bta_mod:glass", Registries.stackListOf(Block.glass, Blocks.clearGlass));

		for (int color = 0; color < 16; color++) {
			Registries.ITEM_GROUPS.getItem("fb_bta_mod:glass").add(new ItemStack(Blocks.colouredGlass, 1, color));
		}

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 15)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("white_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 0));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 1)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("red_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 14));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 14)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("orange_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 1));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 11)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("yellow_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 4));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 7)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("light_gray_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 8));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 8)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("gray_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 7));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 0)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("black_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 15));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 12)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("light_blue_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 3));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 4)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("blue_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 11));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 5)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("purple_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 10));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 3)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("brown_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 12));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 13)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("magenta_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 2));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 2)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("green_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 13));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 9)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("pink_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 6));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 6)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("cyan_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 9));

		RecipeBuilder.Shaped(MOD_ID, "GGG", "GXG", "GGG")
			.addInput('X', (new ItemStack(Item.dye, 1, 10)))
			.addInput('G', ("fb_bta_mod:glass"))
			.create("lime_glass_recipe", new ItemStack(Blocks.colouredGlass, 8, 5));
	}


/*
	public static final Block testBlock = new BlockBuilder(MOD_ID)
		.setTextures("redCross.png")
		.setLuminance(0)
		.setBlockSound(BlockSounds.WOOD)
		.setHardness(2)
		.setResistance(25)
		.build(new BlockGlass("testBlock", 1200, Material.wood, false).withTags(BlockTags.MINEABLE_BY_AXE));

	public static final Block clearGlass = new BlockBuilder(MOD_ID)
		.setTextures("clearGlass.png")
		.setLightOpacity(0)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(2)
		.setResistance(25)
		.build(new BlockGlass("clearGlass",1201, Material.glass, false));

	public static final Block colouredGlass = new BlockBuilder(MOD_ID)
		.setTextures("whiteGlass.png").setTextures("lightGrayGlass.png").setTextures("grayGlass.png").setTextures("blackGlass.png")
		.setTextures("redGlass.png").setTextures("orangeGlass.png").setTextures("yellowGlass.png").setTextures("lightBlueGlass.png")
		.setTextures("blueGlass.png").setTextures("purpleGlass.png").setTextures("brownGlass.png").setTextures("magentaGlass.png")
		.setTextures("greenGlass.png").setTextures("pinkGlass.png").setTextures("cyanGlass.png").setTextures("limeGlass.png")
		.setLightOpacity(0)
		.setBlockSound(BlockSounds.GLASS)
		.setHardness(2)
		.setResistance(25)
		.build(new BlockColouredGlass("colouredGlass", 1202, Material.glass, false));
*/
	@Override
	public void beforeGameStart() {
		CreativeHelper.setParent(Blocks.clearGlass, Block.glass);
		for (int color = 1; color < 17; color++) {
			CreativeHelper.setParent(Blocks.colouredGlass, color - 1, Block.glass, 0);
		}

		Item.itemsList[Blocks.colouredGlass.id] = new ItemColouredGlass(Blocks.colouredGlass);
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {

	}
}
