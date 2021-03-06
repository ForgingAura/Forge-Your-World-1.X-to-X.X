package forgingaura.forgeyourworld.fmagic.block;

import forgingaura.forgeyourworld.FMagic;
import forgingaura.forgeyourworld.fmagic.init.MagicItem;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Created by AlasDiablo on 11/11/2017.
 */
public class WitherCrops extends BlockCrops{

    public WitherCrops(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(FMagic.MODID, unlocalizedName));

    }

    @Override
    protected Item getSeed() {
        return MagicItem.witherseed;
    }

    @Override
    protected Item getCrop() {
        ItemStack stackcrop= new ItemStack(MagicItem.witherfragment);
        Item crop = stackcrop.getItem();
        return crop;
    }
}
