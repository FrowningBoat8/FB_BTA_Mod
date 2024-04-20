package frowningBoat.fb_bta_mod.items.blocks;

import frowningBoat.fb_bta_mod.blocks.BlockColouredGlass;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlock;

public class ItemColouredGlass extends ItemBlock {

	public ItemColouredGlass(Block block) {
		super(block);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	public int getPlacedBlockMetadata(int i) {
		return i;
	}

	public String getLanguageKey(ItemStack itemstack) {
		return super.getKey() + "." + ItemDye.dyeColors[BlockColouredGlass.getMetadataForColour(itemstack.getMetadata())];
	}
}
