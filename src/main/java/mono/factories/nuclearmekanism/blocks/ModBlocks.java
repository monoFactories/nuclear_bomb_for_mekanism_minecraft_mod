package mono.factories.nuclearmekanism.blocks;

import mono.factories.nuclearmekanism.NuclearMekanismMod;
import mono.factories.nuclearmekanism.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NuclearMekanismMod.MOD_ID);

    public static final RegistryObject<Block> SIMPLE_URANIUM_COMPONENT = registerBlock("simple_uranium_component", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> supBlock) {
        RegistryObject<T> toReturn = BLOCKS.register(name, supBlock);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
