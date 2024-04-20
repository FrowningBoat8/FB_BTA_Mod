package frowningBoat.fb_bta_mod.blocks;

import net.minecraft.core.block.BlockGlass;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import turniplabs.halplibe.helper.TextureHelper;

import static frowningBoat.fb_bta_mod.fb_bta_mod.MOD_ID;

public class BlockColouredGlass extends BlockGlass {
	public BlockColouredGlass(String key, int id, Material material, boolean renderInside) {
		super(key, id, material, renderInside);
	}

	public int getRenderBlockPass() {
		return 1;
	}

	public boolean shouldSideBeRendered(WorldSource blockAccess, int x, int y, int z, int side) {
		return super.shouldSideBeRendered(blockAccess, x, y, z, 1 - side);
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case PICK_BLOCK:
			case SILK_TOUCH:
				return new ItemStack[]{new ItemStack(this, 1, meta)};
			default:
				return null;
		}
	}

	public static int getMetadataForColour(int i) {
		return ~i & 15;
	}

	public int getBlockTextureFromSideAndMetadata(Side side, int meta) {
		if (meta == 0) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "whiteGlass.png");
		}
		if (meta == 1) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "orangeGlass.png");
		}
		if (meta == 2) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "magentaGlass.png");
		}
		if (meta == 3) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "lightBlueGlass.png");
		}
		if (meta == 4) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "yellowGlass.png");
		}
		if (meta == 5) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "limeGlass.png");
		}
		if (meta == 6) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "pinkGlass.png");
		}
		if (meta == 7) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "grayGlass.png");
		}
		if (meta == 8) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "lightGrayGlass.png");
		}
		if (meta == 9) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "cyanGlass.png");
		}
		if (meta == 10) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "purpleGlass.png");
		}
		if (meta == 11) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "blueGlass.png");
		}
		if (meta == 12) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "brownGlass.png");
		}
		if (meta == 13) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "greenGlass.png");
		}
		if (meta == 14) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "redGlass.png");
		}
		if (meta == 15) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "blackGlass.png");
		}
		return meta;
	}
}
