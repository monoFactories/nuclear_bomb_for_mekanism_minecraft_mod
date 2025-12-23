package mono.factories.nuclearmekanism.items;

import mono.factories.nuclearmekanism.NuclearMekanismMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NuclearMekanismMod.MOD_ID);

    public static final RegistryObject<Item> ADVANCED_THERMONUCLEAR_REFLECTOR = ITEMS.register("advanced_thermonuclear_reflector", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_PLUTONIUM_BOMB_SHELL = ITEMS.register("big_plutonium_bomb_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_URANIUM_BOMB_SHELL = ITEMS.register("big_uranium_bomb_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_THERMONUCLEAR_BOMB_SHELL = ITEMS.register("big_thermonuclear_bomb_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_PLUTONIUM_BOMB_SHELL = ITEMS.register("common_plutonium_bomb_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_URANIUM_BOMB_SHELL = ITEMS.register("common_uranium_bomb_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_THERMONUCLEAR_BOMB_SHELL = ITEMS.register("common_thermonuclear_bomb_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_PLUTONIUM_BOMB_SHELL = ITEMS.register("small_plutonium_bomb_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_URANIUM_BOMB_SHELL = ITEMS.register("small_uranium_bomb_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_PLUTONIUM_CORE = ITEMS.register("big_plutonium_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_URANIUM_CORE = ITEMS.register("big_uranium_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_THERMONUCLEAR_CORE = ITEMS.register("big_thermonuclear_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_PLUTONIUM_CORE = ITEMS.register("common_plutonium_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_PLUTONIUM_CORE = ITEMS.register("small_plutonium_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_URANIUM_CORE = ITEMS.register("common_uranium_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_URANIUM_CORE = ITEMS.register("small_uranium_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_THERMONUCLEAR_CORE = ITEMS.register("common_thermonuclear_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPRESSED_TNT = ITEMS.register("compressed_tnt", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DTL_ALLOY = ITEMS.register("dtl_alloy", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_PLUTONIUM_DYNAMITE_CORE = ITEMS.register("big_plutonium_dynamite_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_PLUTONIUM_DYNAMITE_CORE = ITEMS.register("common_plutonium_dynamite_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_PLUTONIUM_DYNAMITE_CORE = ITEMS.register("small_plutonium_dynamite_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_URANIUM_DYNAMITE_CORE = ITEMS.register("big_uranium_dynamite_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_URANIUM_DYNAMITE_CORE = ITEMS.register("common_uranium_dynamite_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_URANIUM_DYNAMITE_CORE = ITEMS.register("small_uranium_dynamite_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_THERMONUCLEAR_DYNAMITE_CORE = ITEMS.register("big_thermonuclear_dynamite_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_THERMONUCLEAR_DYNAMITE_CORE = ITEMS.register("common_thermonuclear_dynamite_core", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENRICHED_URANIUM_INGOT = ITEMS.register("enriched_uranium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_CASING = ITEMS.register("lead_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_CASING = ITEMS.register("light_casing", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEUTRON_BOMB = ITEMS.register("neutron_bomb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEUTRON_REFLECTOR = ITEMS.register("neutron_reflector", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUCLEAR_CONTROL_CIRCUIT = ITEMS.register("nuclear_control_circuit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_CORE_BIG = ITEMS.register("plutonium_core_big", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_CORE_COMMON = ITEMS.register("plutonium_core_common", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_CORE_SMALL = ITEMS.register("plutonium_core_small", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_CORE_BIG = ITEMS.register("uranium_core_big", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_CORE_COMMON = ITEMS.register("uranium_core_common", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_CORE_SMALL = ITEMS.register("uranium_core_small", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SIMPLE_URANIUM_COMPONENT = ITEMS.register("simple_uranium_component", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_PLUTONIUM_SHELL = ITEMS.register("small_plutonium_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_URANIUM_SHELL = ITEMS.register("small_uranium_shell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THERMONUCLEAR_CORE_BIG = ITEMS.register("thermonuclear_core_big", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THERMONUCLEAR_CORE_COMMON = ITEMS.register("thermonuclear_core_common", () -> new Item(new Item.Properties()));


    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
