package net.glasslauncher.example.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.world.ItemInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.tile.Tile;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.recipe.SmeltingRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

public class RecipeListener {

    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {

        Identifier type = event.recipeId;
        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
            CraftingRegistry.addShapedRecipe(new ItemInstance(ItemListener.coolItem, 1), "XXX", "X X", "X X", 'X', Tile.DIRT);
        }
        if (type == RecipeRegisterEvent.Vanilla.SMELTING.type()) {
            SmeltingRegistry.addSmeltingRecipe(new ItemInstance(Item.APPLE, 1), new ItemInstance(Tile.CLOTH));
        }
        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.exampleBlock, 1), new ItemInstance(Tile.DIRT));
            CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.exampleBlock2, 1), new ItemInstance(Tile.DIRT), new ItemInstance(Tile.DIRT));
        }
    }
}
