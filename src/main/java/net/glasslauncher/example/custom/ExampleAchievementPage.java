package net.glasslauncher.example.custom;

import net.minecraft.world.level.tile.Tile;
import net.modificationstation.stationapi.api.client.gui.screen.achievement.AchievementPage;
import net.modificationstation.stationapi.api.util.Namespace;

import java.util.Random;

public class ExampleAchievementPage extends AchievementPage {

    public ExampleAchievementPage(Namespace namespace, String pageName) {
        super(namespace, pageName);
    }

    @Override
    public int getBackgroundTexture(Random random, int column, int row, int randomizedRow, int currentTexture) {
        int k = Tile.SAND.id;
        int l = random.nextInt(1 + row) + row / 2;
        if (l <= 37 && row != 35) {
            if (l == 22) {
                k = random.nextInt(2) != 0 ? Tile.REDSTONE_ORE.id : Tile.DIAMOND_ORE.id;
            } else if (l == 10) {
                k = Tile.WOOD.id;
            } else if (l == 8) {
                k = Tile.REDSTONE_ORE.id;
            } else if (l > 4) {
                k = Tile.STONE.id;
            } else if (l > 0) {
                k = Tile.DIRT.id;
            }
        } else {
            k = Tile.BEDROCK.id;
        }

        return k;
    }
}
