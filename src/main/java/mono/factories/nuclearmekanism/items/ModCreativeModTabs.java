package mono.factories.nuclearmekanism.items;

import mono.factories.nuclearmekanism.NuclearMekanismMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NuclearMekanismMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_TABS.register("nuclear_mekanism_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CORE_1.get()))
                    .title(Component.translatable("creative_tab.nuclear_mekanism_tab"))
                    .displayItems((itemDisplayParameters, out) -> {
                        out.accept(ModItems.CORE_1.get());
                        out.accept(ModItems.BOMB_CASING.get());
                    })
                    .build());

    public static void register(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}
