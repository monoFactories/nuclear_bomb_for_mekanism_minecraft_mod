package mono.factories.nuclearmekanism.items;

import mono.factories.nuclearmekanism.NuclearMekanismMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NuclearMekanismMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_TABS.register("nuclear_mekanism_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CORE_1.get()))
                    .title(Component.translatable("creative_tab.nuclear_mekanism_tab"))
                    .displayItems((itemDisplayParameters, out) -> {
                        Class<ModItems> itemsClass = ModItems.class;
                        for (Field field : itemsClass.getDeclaredFields()) {
                            if (Modifier.isStatic(field.getModifiers())) {
                                try {
                                    field.setAccessible(true);
                                    Object obj = field.get(null);
                                    if (obj instanceof RegistryObject<?> def) {
                                        Object obj2 = def.get();
                                        if (obj2 instanceof Item item) {
                                            out.accept(item);
                                        }
                                    }
                                } catch (Exception e) {
                                    NuclearMekanismMod.LOGGER.debug("exception when fill creative tab", e);
                                }
                            }
                        }
                    })
                    .build());

    public static void register(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}
