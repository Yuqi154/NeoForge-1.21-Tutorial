package org.hiedacamellia.tutorial.registries;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.hiedacamellia.tutorial.Tutorial;

public class TutorialItem {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Tutorial.MODID);

    public static final DeferredItem<Item> SIMPLE_ITEM = ITEMS.registerSimpleItem("simple_item", new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    public static final DeferredItem<Item> ITEM = ITEMS.registerItem("item", (properties)-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> REGISTER_ITEM = ITEMS.register("register_item", ()-> new Item(new Item.Properties()));

}
