package forgingaura.forgeyourworld.fresource.init;

import forgingaura.forgeyourworld.FResource;
import forgingaura.forgeyourworld.fresource.ResourceUtils;
import forgingaura.forgeyourworld.fresource.block.*;
import forgingaura.forgeyourworld.util.BasicBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by AlasDiablo on 28/10/2017.
 */
public class ResourceBlock {

    public static Block blazecoalblock;
    public static Block blazecoalore;
    public static Block enderiumore;
    public static Block terilliumore;
    public static Block terilliumblock;
    public static Block reddiamondore;
    public static Block reddiamondblock;
    public static Block enderiumblock;
    public static Block copperore;
    public static Block tinore;

    public static void init() {
        blazecoalblock = new BlazeCoalBlock("blazecoalblock");
        blazecoalore = new BlazeCoalOre("blazecoalore");
        enderiumore = new EnderiumOre("enderiumore");
        terilliumore = new TerilliumOre("terilliumore");
        terilliumblock = new BasicBlockOre(Material.IRON, "terilliumblock", 2, 4.0F, 0);
        reddiamondore = new RedDiamondOre("reddiamondore");
        reddiamondblock = new BasicBlockOre(Material.IRON, "reddiamondblock", 2, 4.0F, 0);
        enderiumblock = new BasicBlockOre(Material.IRON, "enderiumblock", 3, 4.0F, 0);
        copperore = new BasicBlock(Material.ROCK, "copperore", 1, FResource.MODID).setHardness(3.0F);
        tinore = new BasicBlock(Material.ROCK, "tinore", 1, FResource.MODID).setHardness(3.0F);

    }

    public static void register() {
        registerBlock(blazecoalblock);
        registerBlock(blazecoalore);
        registerBlock(enderiumore);
        registerBlock(terilliumore);
        registerBlock(terilliumblock);
        registerBlock(reddiamondore);
        registerBlock(reddiamondblock);
        registerBlock(enderiumblock);
        registerBlock(copperore);
        registerBlock(tinore);

    }

    public static void registerRenders() {
        registerRender(blazecoalblock);
        registerRender(blazecoalore);
        registerRender(enderiumore);
        registerRender(terilliumore);
        registerRender(terilliumblock);
        registerRender(reddiamondore);
        registerRender(reddiamondblock);
        registerRender(enderiumblock);
        registerRender(copperore);
        registerRender(tinore);

    }

    public static void registerBlock(Block block) {
        block.setCreativeTab(FResource.RESOURCE_TAB);
        GameRegistry.findRegistry(Block.class).register(block);
        GameRegistry.findRegistry(Item.class).register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        ResourceUtils.getLogger().info("Registered block: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
                new ResourceLocation(FResource.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
        ResourceUtils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
    }
}
