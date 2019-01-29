package com.karlofduty.EMCRecipies;

import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.java.*;
import org.bukkit.plugin.*;
import org.bukkit.*;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import java.util.*;

public class EMCRecipies extends JavaPlugin
{
    public void onEnable()
    {
        final ShapedRecipe rail = new ShapedRecipe(new NamespacedKey(this, "emc_powered_rail"), new ItemStack(Material.POWERED_RAIL, 16));
        rail.shape(new String[] { "I I", "ISI", "IRI" });
        rail.setIngredient('I', Material.IRON_INGOT);
        rail.setIngredient('S', Material.STICK);
        rail.setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(rail);

        final ShapedRecipe web = new ShapedRecipe(new NamespacedKey(this, "emc_powered_web"), new ItemStack(Material.COBWEB, 1));
        web.shape(new String[] { "WWW", "WWW", "WWW" });
        web.setIngredient('W', Material.STRING);
        Bukkit.addRecipe(web);

        final ShapelessRecipe inkSac = new ShapelessRecipe(new NamespacedKey(this, "emc_ink_sac"), new ItemStack(Material.INK_SAC, 1));
        inkSac.addIngredient(Material.COAL);
        Bukkit.addRecipe(inkSac);

        final ShapelessRecipe inkSac2 = new ShapelessRecipe(new NamespacedKey((Plugin)this, "emc_ink_sac2"), new ItemStack(Material.INK_SAC, 2));
        inkSac2.addIngredient(Material.CHARCOAL);
        Bukkit.addRecipe(inkSac2);

        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_SANDSTONE, 1), Material.SANDSTONE));
        this.getServer().addRecipe(new FurnaceRecipe(new ItemStack(Material.SMOOTH_RED_SANDSTONE, 1), Material.RED_SANDSTONE));
    }

}
